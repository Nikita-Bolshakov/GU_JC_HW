package lesson3.task;

public class Fibonacci {
    // 1 1 2 3 5 8 13 21 34
    public static void main(String[] args) {
        Fibonacci fibbonaccier = new Fibonacci();
        long fib = fibbonaccier.recFibTail(8);
        System.out.println(fib);
    }

    public long recFib(int n) {
        if (n < 3) {
            return 1;
        }
        return recFib(n - 1) + recFib(n - 2);
    }

    public long fib(int n) {
        if (n < 3) {
            return 1;
        }
        long previous = 1, next = 1, sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = previous + next;
            previous = next;
            next = sum;
        }
        return sum;
    }

    public long recFibTail(int n) {
        return recFibTail(n, 0, 1);
    }

    private long recFibTail(int n, long a, long b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return recFibTail(n - 1, b, a + b);
    }
}