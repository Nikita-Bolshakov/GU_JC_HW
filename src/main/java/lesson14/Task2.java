package lesson14;

/**
    2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false.
    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        [ 1 1 1 4 4 1 4 4 ] -> true
        [ 1 1 1 1 1 1 ] -> false
        [ 4 4 4 4 ] -> false
        [ 1 4 4 1 1 4 3 ] -> false
 */

public class Task2 {

    public boolean checkArrayFor1And4(int[] array) {
        int count1 = 0, count4 = 0;
        for (int i : array) {
            if (i == 1) {
                count1++;
            }
            else if (i == 4) {
                count4++;
            }
            else return false;
        }
        return (count1 > 0 && count4 > 0);
    }

}