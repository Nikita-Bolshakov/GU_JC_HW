package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(9);
        int attempts = 0;
        System.out.println("Игра угадайка.\nОтгадайте число от 0 до 9. У вас есть 3 попытки. Let's Go!");
        while (attempts < 3) {
            System.out.println("Введите число:");
            int userNumber = scan.nextInt();
            if (userNumber < random) {
                System.out.println("Это число меньше, чем загадано программой.");
            } else if (userNumber > random) {
                System.out.println("Это число больше, чем загадано программой.");
            } else if (userNumber == random) {
                System.out.println("Вы угадали!");
                break;
            }
            attempts++;
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет.");
        String userChoice = scan.next();
        if (userChoice.equals("1")) {
            main(null);
        } else {
            System.out.println("Игра окончена.");
        }
    }
}