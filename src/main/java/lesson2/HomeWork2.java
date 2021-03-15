package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание 2\n");
        int[] fillArray = new int[8];
        for (int i = 0, j = 0; i < fillArray.length; i++, j += 3) {
            fillArray[i] = j;
            System.out.print(fillArray[i] + " ");
        }
    }
}