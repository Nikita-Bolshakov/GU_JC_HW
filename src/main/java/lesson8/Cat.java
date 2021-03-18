package lesson8;

public class Cat implements Action {

    private String name;
    private int runLimit;
    private int jumpLimit;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void runFree() {
        System.out.println("Кот" + " " + name + " " + "бежит.");
    }

    @Override
    public void jumpFree() {
        System.out.println("Кот" + " " + name + " " + "прыгает.");
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (runLimit >= treadmill.getLength()) {
            System.out.println("Кот" + " " + name + " " + "успешно пробежал. Ура!");
        } else {
            System.out.println("Кот" + " " + name + " " + "не смог пробежать.");
        }
    }

    @Override
    public void jumpWall(Wall wall) {
        if (jumpLimit >= wall.getHeight()) {
            System.out.println("Кот" + " " + name + " " + "успешно перепрыгнул через стену. Ура!");
        } else {
            System.out.println("Кот" + " " + name + " " + "не смог перепрыгнуть через стену.");
        }
    }

    @Override
    public void runTreadmill(int treadmill) {
        if (runLimit >= treadmill) {
            System.out.println("Кот" + " " + name + " " + "успешно пробежал. Ура!");
        } else {
            System.out.println("Кот" + " " + name + " " + "не смог пробежать.");
        }
    }

    @Override
    public void jumpWall(int wall) {
        if (jumpLimit >= wall) {
            System.out.println("Кот" + " " + name + " " + "успешно перепрыгнул через стену. Ура!");
        } else {
            System.out.println("Кот" + " " + name + " " + "не смог перепрыгнуть через стену.");
        }
    }

    @Override
    public boolean runTreadmillAgain(int treadmill) {
        return runLimit >= treadmill;
    }

    @Override
    public boolean jumpWallAgain(int wall) {
        return jumpLimit >= wall;
    }

}