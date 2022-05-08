package Arrays;

import java.util.*;

public class Arrange_even_odd {
    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int n = sc.nextInt();
         * int[] arr = new int[n];
         * for (int i = 0; i < n; i++) {
         * arr[i] = sc.nextInt();
         * }
         */
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        arrangeEvenOdd(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void arrangeEvenOdd(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (arr[i] % 2 == 0 && i < j) {
                i++;
            }
            while (arr[j] % 2 == 1 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
    }
}
