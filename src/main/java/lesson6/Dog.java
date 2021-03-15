package lesson6;

    // 1. Создать классы Собака и Кот с наследованием от класса Животное. Собака+

    // 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.). Собака+

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length >= 0 && length <= 500) {
            super.run(length);
        }
        if (length > 500) {
            System.out.println(getName() + " больше не может бежать! " + getName() + " устал.");
        }
        if (length < 0) {
            System.out.println("Ошибка! " + getName() + " не может бежать в минус.");
        }
    }

    @Override
    public void swim(int length) {
        if (length >=0 && length <= 10) {
            super.swim(length);
        }
        if (length > 10) {
            System.out.println(getName() + " больше не может плыть! " + getName() + " устал.");
        }
        if (length < 0) {
            System.out.println("Ошибка! " + getName() + " не может плыть в минус.");
        }
    }

}