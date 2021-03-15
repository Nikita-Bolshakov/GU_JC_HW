package lesson6;

    // 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.').

    // 4. Добавить подсчет созданных котов, собак и животных.

public class Animal {

    private String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int length) {
        System.out.println(name + " пробежал " + length + " метров.");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл " + length + " метров.");
    }

    public static int getCount() {
        return count;
    }

}