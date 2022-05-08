import java.util.*;

public class Fibonacci_recursion {
    static long[] Fibo_array;

    static long fibonacci(int x) {
        if (x <= 1) {
            return x;
        }
        if (Fibo_array[x] != 0) {
            return Fibo_array[x];
        }
        long nthFiboNum = (fibonacci(x - 1) + fibonacci(x - 2));
        Fibo_array[x] = nthFiboNum;

        return fibonacci(x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position:");
        int n = input.nextInt();
        Fibo_array = new long[n + 1];
        input.close();
        int i = 0;
        System.out.println("The series is: ");
        while (i < n) {
            System.out.print(fibonacci(i) + " ");
            i++;
        }
    }

}
