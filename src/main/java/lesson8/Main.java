package lesson8;

    // 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль). +++

    // 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). +++

    // 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий. +++

    // 4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет. +++

public class Main {

    public static final int NUMBER_OF_PARTICIPANTS = 3;
    public static final int NUMBER_OF_OBSTACLES = 2;

    public static void main(String[] args) {

        task1(); // задание 1
        task2(); // задание 2
        task3(); // задание 3
        task4(); // задание 4

    }

    public static void task1() {

        Human human = new Human("Боб", 50, 75);
        Cat cat = new Cat("Барсик", 125, 25);
        Robot robot = new Robot("Железяга", 3000, 3000);
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(50);

        System.out.println("<<<---- Задание 1 ---->>>");

        human.runFree();
        human.jumpFree();
        cat.runFree();
        cat.jumpFree();
        robot.runFree();
        robot.jumpFree();

        System.out.println();

    }

    public static void task2() {

        Human human = new Human("Боб", 50, 75);
        Cat cat = new Cat("Барсик", 125, 25);
        Robot robot = new Robot("Железяга", 3000, 3000);
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(50);

        System.out.println("<<<---- Задание 2 ---->>>");

        human.runTreadmill(treadmill);
        human.jumpWall(wall);
        cat.runTreadmill(treadmill);
        cat.jumpWall(wall);
        robot.runTreadmill(treadmill);
        robot.jumpWall(wall);

        System.out.println();

    }

    public static void task3() {

        Action[] participantsArray = new Action[NUMBER_OF_PARTICIPANTS];

        participantsArray[0] = new Human("Боб", 50, 75);
        participantsArray[1] = new Cat("Барсик", 125, 25);
        participantsArray[2] = new Robot("Железяга", 3000, 3000);

        Obstacle[] obstacleArray = new Obstacle[NUMBER_OF_OBSTACLES];

        obstacleArray[0] = new Treadmill(100);
        obstacleArray[1] = new Wall(50);

        System.out.println("<<<---- Задание 3 ---->>>");

        for (Action member : participantsArray) {
                member.runTreadmill(80);
                    member.jumpWall(50);
        }

        System.out.println();

    }

    public static void task4() {

        Action[] participantsArray = new Action[NUMBER_OF_PARTICIPANTS];

        participantsArray[0] = new Human("Боб", 50, 75);
        participantsArray[1] = new Cat("Барсик", 125, 25);
        participantsArray[2] = new Robot("Железяга", 3000, 3000);

        Obstacle[] obstacleArray = new Obstacle[NUMBER_OF_OBSTACLES];

        obstacleArray[0] = new Treadmill(100);
        obstacleArray[1] = new Wall(50);

        System.out.println("<<<---- Задание 4 ---->>>");

        for (Action member : participantsArray) {
            if (member.runTreadmillAgain(100) && member.jumpWallAgain(50)) {
                    System.out.println(member.getName() + " " + "прошел беговую дорожку и стену! Ура!");
            }
            if (member.runTreadmillAgain(100) && !member.jumpWallAgain(50)){
                    System.out.println(member.getName() + " " + "прошел беговую дорожку. Не прошел, стену. Вылетает!");
            }
            if (!member.runTreadmillAgain(100)) {
                    System.out.println(member.getName() + " " + "не прошел беговую дорожку. Вылетает!");
            }
        }

        System.out.println();

    }

}