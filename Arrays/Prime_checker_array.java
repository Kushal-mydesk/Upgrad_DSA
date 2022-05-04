package Arrays;

import java.util.*;

public class Prime_checker_array {
    public static int[] check_prime(int[] arr) {
        boolean isPrime = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 8, 9, 10, 13, 15 };
        System.out.println(Arrays.toString(check_prime(arr)));
    }
}
