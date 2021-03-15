package lesson2;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание 4\n");
        int[][] diagonalArray = new int[8][8];
        for (int i = 0; i< diagonalArray.length; i++) {
            for (int j = 0; j < diagonalArray[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    diagonalArray[i][j] = 0;
                } else {
                    diagonalArray[i][j] = 1;
                }
                System.out.print(" " + diagonalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}