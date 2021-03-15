package lesson6;

public class Main {

    public static void main(String[] args) {

        letsGo();

    }

    public static void letsGo() {

        Animal duckTest = new Animal("Тестовый Утя");
        duckTest.run(666);
        duckTest.swim(70);
        System.out.println("Это " + duckTest.getName() + " !");

        Cat catBob = new Cat("Боб", "Боббович");
        catBob.run(234);
        catBob.swim(3);

        Dog dogRocky = new Dog("Рокки");
        dogRocky.run(748);
        dogRocky.swim(5);

        Cat catTomas = new Cat("Томас", "Томассович");
        catTomas.run(42);

        Dog dogTuzik = new Dog("Тузик");
        dogTuzik.run(321);
        dogTuzik.swim(-44);

        Animal catBobby = new Cat("Пушок", "Пушкович");
        catBobby.swim(7);

        Animal dogLighting = new Dog("Молния");
        dogLighting.run(33);
        dogLighting.setName("Снежок");
        System.out.println("Молния стал Снежком...");
        dogLighting.swim(9);

        Seagull seagullKook = new Seagull("Кук");
        seagullKook.swim(1000);
        seagullKook.run(60);
        seagullKook.fly(500,30);

        System.out.println("Количество созданных животных: " + Animal.getCount());

    }

}