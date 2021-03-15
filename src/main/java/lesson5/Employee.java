package lesson5;

    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String post;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String number;

    private String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным.");
        }
    }

    // 2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String name, String post, String email, String number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса "Сотрудник" написать метод, который выводит информацию об объекте в консоль.

    public void info(){
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);
        System.out.println("Номер: " + number);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}