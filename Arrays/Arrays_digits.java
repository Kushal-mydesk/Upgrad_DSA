package Arrays;

import java.util.*;

public class Arrays_digits {

    static int j = 0;

    public static void main(String[] args) {
        int k, n;
        Scanner s = new Scanner(System.in);
        k = s.nextInt();
        n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] arr1 = new int[n / k];

        merge(arr, 0, arr.length - 1, arr1, k);
        System.out.println(Arrays.toString(arr1));

        s.close();

    }

    public static void merge(int[] arr, int start, int end, int[] arr1, int k) {
        int total = 0;
        int multiplier = 1;
        if (end > arr.length - 1) {
            end = arr.length - 1;
        }
        for (int i = end; i >= start; i--) {
            if (arr[i] == 0) {
                multiplier *= 10;
            }

            else {
                total += arr[i] * multiplier;
                multiplier *= 10;
            }
        }
        arr1[j] = total;
        j++;
        if (end == arr.length - 1) {
            return;
        }
        merge(arr, end + 1, end + k, arr1, k);

    }

}
