package lesson2;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание 3\n");
        int[] changeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < changeArray.length; i++) {
            if (changeArray[i] < 6) {
                    changeArray[i] *= 2;
            }
                System.out.print(changeArray[i] + " ");
        }
    }
}