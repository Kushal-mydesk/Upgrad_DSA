package Sorting;

/**
 * Arr_min_max
 * Find the difference between max and min sum
 * Description
 * 
 * Given a an array arr of size n. Your task is to find the maximum sum and
 * minimum sum difference between x-y elements.
 * 
 * 
 * ﻿Example 1:
 * 
 * Input:
 * 
 * n = 5
 * 
 * arr = [2, 1, 4, 5, 3]
 * 
 * x = 1
 * 
 * y = 5
 * 
 * Output:
 * 
 * 4
 * 
 * 
 * Explanation:
 * 
 * x is 1 and y is 5 so you have to calculate maximum and minimum sum using (5-1
 * =) 4 elements.
 * 
 * Maximum sum using the 4 elements would be (2+3+4+5=)14.
 * 
 * Minimum sum using the 4 elements would be (1+2+3+4=)10.
 * 
 * Difference will be 14-10=4.
 * 
 * 
 * 
 */
public class Arr_min_max {

    public static int maxMinDifference(int[] arr, int x, int y) {
        // Write your code here
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        int maxsum = 0, minsum = 0;
        for (int i = 0; i < diff; i++) {
            minsum = minsum + arr[i];
        }
        for (int i = (arr.length - diff); i <= arr.length - 1; i++) {
            maxsum = maxsum + arr[i];
        }

        return maxsum - minsum;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 5, 3 };
        int x = 1;
        int y = 5;
        int result = maxMinDifference(arr, x, y);
        System.out.println(result);
    }
}