package lesson12;

import java.util.Arrays;

    /**
    Необходимо написать два метода, которые делают следующее:
    1) Создают одномерный длинный массив, например:
        static final int SIZE = 10 000 000;
        static final int HALF = size / 2;
        float[] arr = new float[size].
    2) Заполняют этот массив единицами.
    3) Засекают время выполнения: long a = System.currentTimeMillis().
    4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    5) Проверяется время окончания метода System.currentTimeMillis().
    6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).

    Отличие первого метода от второго:
        Первый просто бежит по массиву и вычисляет значения.
        Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.

    Пример деления одного массива на два:
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h).

    Пример обратной склейки:
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h).

    Примечание:
        System.arraycopy() — копирует данные из одного массива в другой:
        System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем).

    По замерам времени:
    Для первого метода надо считать время только на цикл расчета:
        for (int i = 0; i < size; i++) {
   arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}
    Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
     */

public class Main {

        private static final int SIZE = 10_000_000;
        private static final int HALF_SIZE = SIZE / 2;

    public static void main(String[] args) {

        Main main = new Main();

        main.singleFlow();
        main.twoFlow();

    }

    public float[] calculate(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return array;
    }

    public void singleFlow() {

        float[] array = new float[SIZE];

        Arrays.fill(array, 1.0f);

        long a = System.currentTimeMillis();

        calculate(array);

        System.out.println("Время работы метода singleFlow: " + (System.currentTimeMillis() - a));

    }

    public void twoFlow() {

        float[] array = new float[SIZE];
        float[] array1 = new float[HALF_SIZE];
        float[] array2 = new float[HALF_SIZE];

        Arrays.fill(array, 1.0f);

        long a = System.currentTimeMillis();

        System.arraycopy(array, 0, array1, 0, HALF_SIZE);
        System.arraycopy(array, HALF_SIZE, array2, 0, HALF_SIZE);

        new Thread(() -> {
            float[] a1 = calculate(array1);
            System.arraycopy(a1, 0, array1, 0, a1.length);
        }).start();

        new Thread(() -> {
            float[] a2 = calculate(array2);
            System.arraycopy(a2, 0, array2, 0, a2.length);
        }).start();

        System.arraycopy(array1, 0, array, 0, HALF_SIZE);
        System.arraycopy(array2, 0, array, HALF_SIZE, HALF_SIZE);

        System.out.println("Время работы метода twoFlow: " + (System.currentTimeMillis() - a));

    }

}