package lesson1;

public class FirstApp {

    public static void main(String[] args) {

        System.out.println("\nМоя первая программа:\n\nHello, World!\n");

        variables();
        System.out.println("a * (b + (c / d)) = " + calculate(666.666f, 51.1f, 1850.321f, 7.50f));
        System.out.println("Сумма чисел лежит в пределах от 10 до 20 (включительно): " + task10and20(7, 7));
        numberPositiveOrNegative1(-31);
        System.out.println(numberPositiveOrNegative2(345));
        greetings("Иван Иванович");
        year(2021);

    }

    public static void variables() {

        System.out.println("Задание 2\n");

        byte black = 7;
        short gray = 250;
        int yellow = 1111;
        long red = 70000L;
        float white = 13.876f;
        double green = 666.6;
        char pink = 'Z';
        boolean orange = true;

        System.out.println("Переменная типа byte: " + black);
        System.out.println("Переменная типа short: " + gray);
        System.out.println("Переменная типа int: " + yellow);
        System.out.println("Переменная типа long: " + red);
        System.out.println("Переменная типа float: " + white);
        System.out.println("Переменная типа double: " + green);
        System.out.println("Переменная типа char: " + pink);
        System.out.println("Переменная типа boolean: " + orange);

    }

    public static float calculate(float a, float b, float c, float d) {

        System.out.println("\nЗадание 3\n");

        return a * (b + (c / d));

    }

    public static boolean task10and20(int a1, int a2) {

        System.out.println("\nЗадание 4\n");

        int sum = a1 + a2;

        if (sum >= 10 && sum <= 20) return true;

            return false;

    }

    public static void numberPositiveOrNegative1(int b1) {

        System.out.println("\nЗадание 5\n");

        if (b1 >= 0) {

            System.out.println("Число " + b1 + " положительное");

        } else {

            System.out.println("Число " + b1 + " отрицательное");

        }

    }

    public static boolean numberPositiveOrNegative2(int z1) {

        System.out.println("\nЗадание 6\n");

        if (z1 < 0) return true;

        return false;

    }

    public static void greetings(String name) {

        System.out.println("\nЗадание 7\n");

        System.out.println("Привет " + name + "!");

    }

    public static void year(int year) {

        System.out.println("\nЗадание 8\n");

        if (!(year % 4 == 0) || year % 100 == 0 && !(year % 400 == 0)) {

            System.out.println(year + " год не високосный");

        } else {

            System.out.println(year + " год високосный");

        }

    }

}
