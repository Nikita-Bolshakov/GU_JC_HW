package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    // 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

    public void decreaseFood1(int n) {
        if ((food -= n) >= 0) {
            System.out.println("Кот поел на " + n + " ед. В тарелке осталось пищи: " + food + " ед.");
        } else {
            int changeFood = (food += n); // не может получиться отрицательного количества еды / кот не трогает еду
            System.out.println("В тарелке " + changeFood + " ед. пищи. Кот хочет " + n + " ед. пищи. Пополните тарелку минимум на " + (n - food) + " ед. пищи, чтобы кот наелся.");
        }
    }

    // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

    public void addFood(int plusFood) {
        System.out.println("Пополнение тарелки на " + plusFood + " ед. Теперь пищи в тарелке: " + (food += plusFood));
    }

    public void info() {
        System.out.println("___Пищи в тарелке: " + food + " ед.___");
    }

    public boolean decreaseFood2(int n) {      // метод для массива котов
        if ((food -= n) >= 0) {
            return true;
        } else {
            food += n; // не может получиться отрицательного количества еды / кот не трогает еду
            return false;
        }
    }

}