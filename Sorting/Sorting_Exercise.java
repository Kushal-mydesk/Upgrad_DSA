package Sorting;

import java.util.Arrays;

/**
 * Sorting_Exercise
 */
public class Sorting_Exercise {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] arr2 = { 10, 9, 8, 7, 6 };
        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        mergesort(arr2);
        System.out.println(Arrays.toString(arr2));
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
            while (arr[rightpointer] >= pivot && leftpointer < rightpointer) {
                rightpointer--;
            }
            swap(arr, leftpointer, rightpointer);
        }
        swap(arr, leftpointer, highindex);

        quicksort(arr, lowindex, leftpointer - 1);
        quicksort(arr, leftpointer + 1, highindex);
    }

    private static void swap(int[] arr, int leftpointer, int rightpointer) {
        int temp = arr[leftpointer];
        arr[leftpointer] = arr[rightpointer];
        arr[rightpointer] = temp;
    }

    private static void mergesort(int[] arr) {
        int inputlength = arr.length;

        if (inputlength < 2) {
            return;
        }
        int midindex = inputlength / 2;

        int[] leftarr = new int[midindex];
        int[] rightarr = new int[inputlength - midindex];

        for (int i = 0; i < midindex; i++) {
            leftarr[i] = arr[i];
        }
        for (int i = midindex; i < inputlength; i++) {
            rightarr[i - midindex] = arr[i];
        }

        mergesort(leftarr);
        mergesort(rightarr);

        merge(arr, leftarr, rightarr);
    }

    private static void merge(int[] arr, int[] leftarr, int[] rightarr) {
        int leftsize = leftarr.length;
        int rightsize = rightarr.length;
        int i = 0, j = 0, k = 0;
        while (i < leftsize && j < rightsize) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }
        while (i < leftsize) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < rightsize) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }
}
