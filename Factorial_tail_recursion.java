//This solves the factorial problem with tail recursion where the recursion is happening in the last line

import java.util.*;

public class Factorial_tail_recursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = input.nextInt();
        int out = 1;

        System.out.println("The factorial is:" + fact(n, out));
        input.close();

    }

    public static long fact(int x, int y) {
        if (x == 0) {
            return y;
        }
        return fact(x - 1, y * x);
    }
}
