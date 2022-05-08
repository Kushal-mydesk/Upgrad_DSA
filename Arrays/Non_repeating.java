package Arrays;

import java.util.*;

public class Non_repeating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = firstNonRepeating(arr);
        if (answer != 0)
            System.out.print(answer);
        else
            System.out.print("All elements are repeated");

        s.close();
    }

    private static int firstNonRepeating(int[] arr) {
        int Non_repeating = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n) {
                    Non_repeating = arr[i];
                    return Non_repeating;
                }
                if (j != i && arr[i] == arr[j]) {
                    break;
                }
            }
        }
        return 0;
    }
}
