package lesson10;

    /*
    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
    2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
    */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.task1(); // задание 1
        main.task2(); // задание 2

    }

    public void task1() {

        Map <String,Integer> hashmap = new HashMap<>();

        List <String> words = new ArrayList<>(Arrays.asList(
                "moon","sun","dog","sky","cat",
                "apple","cat","sky","moon","dog",
                "tree","guitar","drums","lake","dog",
                "car","dog","sky","table","pen",
                "table","table","table","table","table"
        ));

        for (String word : words) {
            if (hashmap.containsKey(word)) {
                hashmap.put(word, hashmap.get(word) + 1);
            } else {
                hashmap.put(word, 1);
            }
        }

        System.out.println("------------- Задание 1: Слова. -------------");
        System.out.println(hashmap);
        System.out.println();

    }

    public void task2() {

        PhoneDirectory isPhoneDirectory = new PhoneDirectory();

        isPhoneDirectory.add("Кук", "123");
        isPhoneDirectory.add("Сидоров", "89521112233");
        isPhoneDirectory.add("Сидоров", "89110000000");
        isPhoneDirectory.add("Сидоров", "89005559988");
        isPhoneDirectory.add("АБВ", "1111111");
        isPhoneDirectory.add("Петросян", "666");
        isPhoneDirectory.add("Петросян", "444");


        System.out.println("------------- Задание 2: Телефонный справочник. -------------");
        System.out.println(isPhoneDirectory.get("Кук"));
        System.out.println(isPhoneDirectory.get("Сидоров"));
        System.out.println(isPhoneDirectory.get("АБВ"));
        System.out.println(isPhoneDirectory.get("Петросян"));

    }

}