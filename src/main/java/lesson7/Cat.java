package lesson7;

public class Cat {

    private String name;
    private int appetite;
    private Breeds breed;

    // 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.

    private boolean satiety; // по умолчанию значение "false"

    public Cat(String name, int appetite, Breeds breed) {
        this.name = name;
        this.appetite = appetite;
        this.breed = breed;
    }

    public void eat1(Plate p) {
        p.decreaseFood1(appetite);
    }

    public boolean eat2(Plate p) {
        return satiety || p.decreaseFood2(appetite);   // метод для массива котов
    }

    //  true || true  =	true
    //  true || false =	true
    // false || true  =	true
    // false || false =	false

}