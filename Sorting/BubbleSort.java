package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubblesort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble sorting with recursion, just replacing the outer for loop with
    // recursion
    public static void bubblrec(int[] arr, int size) {
        if (size <= 1) {
            // no need for further sorting
            return;
        }
        for (int j = 0; j < size - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        bubblrec(arr, size - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements you want to put into Sort: ");
        int n = input.nextInt();
        int ele;
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Element for position " + i);
            ele = input.nextInt();
            arr[i] = ele;
        }
        System.out.println("Before sorting Your array is " + Arrays.toString(arr));

        // bubblesort(arr);
        // bubblrec(arr, n);
        System.out.println("After sorting Your array is " + Arrays.toString(arr));
        input.close();

    }
}
