package lesson2;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание 5\n");
        int[] array5 = {7, 5, 3, 1, 500, 333, 123, 1521};
        System.out.println("array5.length: " + array5.length + "\n");
        int min = array5[0];
        int max = array5[0];
        int indMin = 0;
        int indMax = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] < min) {
                min = array5[i];
                indMin = i;
            }
            if (array5[i] > max) {
                max = array5[i];
                indMax = i;
            }
        }
        System.out.println("Минимальный элемент\n" + "Индекс: " + indMin + "\n" + "Значение: " + min + "\n");
        System.out.println("Максимальный элемент\n" + "Индекс: " + indMax + "\n" + "Значение: " + max);
    }
}