package lesson9;

public class MyArrayDataException extends Throwable {
    int i;
    int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

}
