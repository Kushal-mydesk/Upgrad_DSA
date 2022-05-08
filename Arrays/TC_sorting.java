package Arrays;

import java.util.Arrays;

public class TC_sorting {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 8, 2, 5, 8, 100, 366, 6, 4 };

        NtimeArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] NtimeArray(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }

        return arr;
    }
}