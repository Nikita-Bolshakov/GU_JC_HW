package lesson2;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание 1\n");
        int[] replaceArray = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0};
        System.out.println("replaceArray.length: " + replaceArray.length + "\n");
        for (int i = 0; i < replaceArray.length; i++) {
            if (replaceArray[i] == 0) {
                System.out.print(1 + " ");
            } else if (replaceArray[i] == 1) {
                System.out.print(0 + " ");
            } else {
                System.out.print("Ошибка!"); // Добавлено число не по условию задачи. Нужно 0 или 1.
            }
        }
    }
}