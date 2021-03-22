package lesson9;

    /*
     1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
     2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
     3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
    */

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        String[][] arrayNameless = {
                {"1", "3", "5", "7"},
                {"1", "3", "5", "7"},
                {"1", "3", "5", "7"},
                {"1", "3", "5", "7"}
        };

        try {
            main.testException(arrayNameless);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка!");
            System.out.println("Размер массива не 4 x 4 !" + " " + e.getMessage());
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка!");
            System.out.println("Неправильное значение в ячейке:" + " " + e.i + " " + "х" + " " + e.j);
            e.printStackTrace();
        } finally {
            System.out.println("Конец ДЗ-9... Как то так...");
        }

    }

    public void testException(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j].length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        System.out.println("Сумма чисел массива:" + " " + sum);

    }

}
