package lesson7;

    // 1. Расширить задачу про котов и тарелки с едой.

public class Main {

    public static final int NUMBER_OF_CATS = 5;

    public static void main(String[] args) {

        singleCat();    // 1 кот
        isArmyOfCats(); // массив котов

    }

    public static void singleCat() {

        Cat barsik = new Cat("Барсик", 50, Breeds.HOME);
        Plate plate1 = new Plate(20);

        System.out.println("<<<___singleCat___>>>");
        plate1.info();
        barsik.eat1(plate1);
        plate1.addFood(70);
        barsik.eat1(plate1);
        plate1.info();
        System.out.println();

    }

    // 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.

    public static void isArmyOfCats() {

        Cat[] cats = new Cat[NUMBER_OF_CATS];

        cats[0] = new Cat("Дымсик",25, Breeds.HOME);
        cats[1] = new Cat("Рыжик",5, Breeds.HOME);
        cats[2] = new Cat("Пушок",100, Breeds.PERSIAN);
        cats[3] = new Cat("Китти",75, Breeds.PERSIAN);
        cats[4] = new Cat("Вася",15, Breeds.HOME);

        Plate plate2 = new Plate(100);

        System.out.println("<<<___isArmyOfCats___>>>");

        plate2.info();

        for (Cat cat : cats) {
            System.out.println(cat.eat2(plate2));
            plate2.info();
        }

    }

}