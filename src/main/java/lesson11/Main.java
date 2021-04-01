package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    /**
     1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа).
     2. Написать метод, который преобразует массив в ArrayList.
     3. Задача:
        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList;
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку.
     */

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.task1();
        main.task2();
        main.task3();

    }

    public void replacement(Object[] array, int A, int B) {

        System.out.println(Arrays.toString(array));

        Object C = array[A];
        array[A] = array[B];
        array[B] = C;

        System.out.println(Arrays.toString(array));

    }

    public void task1() {

        Main main = new Main();

        Integer[] array1 = {1, 3, 21, 308, 1221, 7, 2};
        String[] array2 = {"ААА", "БББ", "ZZZ", "Java", "555"};
        Byte[] array3 = {73, -60, 111, 5, -13, 24, 50};

        System.out.println("Задание 1");

        main.replacement(array1,3,0);
        main.replacement(array2,0,3);
        main.replacement(array3,1,5);

        System.out.println();

    }

    public <T> void inArrayList(T[] array) {

        List<T> abc = new ArrayList<>(Arrays.asList(array));

        System.out.println(abc);

    }

    public void task2() {

        Main main = new Main();

        Integer[] array = {1155, -23, -121, 505, 12, 77, 92};

        System.out.println("Задание 2");

        main.inArrayList(array);

        System.out.println();

    }

    public void task3() {

        System.out.println("Задание 3");

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Apple> appleBox3 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox1.addFruit(new Apple(),15);
        appleBox2.addFruit(new Apple(),100);
        appleBox3.addFruit(new Apple(),25);
        orangeBox1.addFruit(new Orange(),10);
        orangeBox2.addFruit(new Orange(),45);

        System.out.println("Метод getWeight:");
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox2.getWeight());

        System.out.println("Метод compare:");
        System.out.println(appleBox2.compare(orangeBox1));
        System.out.println(appleBox1.compare(orangeBox1));
        System.out.println(appleBox3.compare(appleBox2));

        System.out.println("Метод isPourItOver:");
        appleBox1.isPourItOver(appleBox2);
        appleBox2.isPourItOver(appleBox3);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox3.getWeight());

    }

}