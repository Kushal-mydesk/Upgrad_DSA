package Sorting;

import java.util.*;

public class Sorting_3_elements {

    public static void sort123(int[] arr) {
        int i0 = 0;
        int i1 = 0;
        int i2 = arr.length - 1;

        while (i1 <= i2) {
            if (arr[i1] == 1) {
                i1++;
            } else if (arr[i1] == 0) {
                int temp = arr[i0];
                arr[i0] = arr[i1];
                arr[i1] = temp;
                i1++;
                i0++;
            } else {
                int temp = arr[i2];
                arr[i2] = arr[i1];
                arr[i1] = temp;
                i2--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 2, 1, 0, 2, 0, 1 };
        sort123(arr);
        System.out.println("After sorting Your array is " + Arrays.toString(arr));
    }
}
