package lesson6;

    // 1. Создать классы Собака и Кот с наследованием от класса Животное. Кот+

    // 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.). Кот+

public class Cat extends Animal {

    private String lastName;

    public Cat(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void run(int length) {
        if (length >= 0 && length <= 200) {
            System.out.println(getName() + " " + getLastName() + " пробежал " + length + " метров.");
        }
        if (length > 200) {
            System.out.println(getName() + " " + getLastName() + " больше не может бежать! " + getName() + " " + getLastName() + " устал.");
        }
        if (length < 0) {
            System.out.println("Ошибка! " + getName() + " " + getLastName() + " не может бежать в минус.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(getName() + " " + getLastName() + " не умеет плавать! К сожалению " + getName() + " " + getLastName() + " утонул :(");
    }

}