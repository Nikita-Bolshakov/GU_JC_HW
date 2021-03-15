package lesson5;

public class Main {

    public static void main(String[] args) {

        go();

    }

    public static void go() {

        // 4. Создать массив из 5 сотрудников.

        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Иванов Иван Иванович", "Директор", "qwerty@gmail.com", "5554447", 200_000, 55);
        personArray[1] = new Employee("Кутузов Павел Васильевич", "Веб-разработчик", "ytrewq@gmail.com", "5324441", 120_000, 27);
        personArray[2] = new Employee("Кут Алиса Батьковна", "Веб-дизайнер", "alisakut@gmail.com", "5554442", 130_000, 43);
        personArray[3] = new Employee("Американов Джон Батькович", "Копирайтер", "johhhn@gmail.com", "5554443", 80_000, 21);
        personArray[4] = new Employee("Неизвестная Алина Кодеровна", "Android-разработчик", "555666@gmail.com", "5554444", 100_000, 45);

        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (Employee person : personArray) {
            if (person.getAge() > 40) {
                    person.info();
            }
        }

        // Тест сеттера

        personArray[0].setSalary(1_000_000);

        System.out.println("Новая З/П Директора: " + personArray[0].getSalary());

    }

}