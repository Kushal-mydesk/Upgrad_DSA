package Arrays;

import java.util.*;

public class Repeating_Missing_arr {
    static void findRepeatingAndMissing(int[] arr, int size) {
        int i;

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println("Repeating no is : [ " + abs_val + "]");
        }

        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println("Missing number is : [ " + (i + 1) + " ]");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        findRepeatingAndMissing(arr, arr.length);
    }
}
