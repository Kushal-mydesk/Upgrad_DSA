package Arrays;

import java.util.*;

public class Min_in_rotated {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMinElement(arr);

        System.out.println(result);

        sc.close();
    }

    private static int findMinElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start < end) {
            mid = start + ((end - start) / 2);
            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}
