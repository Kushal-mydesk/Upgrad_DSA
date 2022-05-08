package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("The bofore: " + Arrays.toString(arr));

        quicksort(arr, 0, arr.length - 1);
        System.out.println("The After: " + Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int lowindex, int highindex) {
        if (lowindex >= highindex) {
            return;
        }
        int pivot = arr[highindex];
        int leftpointer = lowindex;
        int rightpointer = highindex;
        while (leftpointer < rightpointer) {
            while (arr[leftpointer] <= pivot && leftpointer < rightpointer) {
                leftpointer++;
            }
            while (arr[rightpointer] >= pivot && rightpointer > leftpointer) {
                rightpointer--;
            }
            swap(arr, leftpointer, rightpointer);
        }
        swap(arr, leftpointer, highindex);

        quicksort(arr, lowindex, leftpointer - 1);
        quicksort(arr, leftpointer + 1, highindex);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
