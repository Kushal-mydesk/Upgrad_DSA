package Sorting;

import java.util.*;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // It found a smaller element so update the min index
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements you want to put into Sort: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Element for position " + i);
            arr[i] = input.nextInt();

        }
        System.out.println("Before sorting Your array is " + Arrays.toString(arr));

        int[] arr2 = selectionSort(arr);
        System.out.println("After sorting Your array is " + Arrays.toString(arr2));
        input.close();

    }
}
