package lesson6;

public class Seagull extends Animal {

    public Seagull(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        super.run(length);
    }

    @Override
    public void swim(int length) {
        super.swim(length);
    }

    public void fly(int length, int speed) {
        System.out.println(getName() + " пролетел " + length + " метров со скоростью " + speed + " м/мин.");
    }

}