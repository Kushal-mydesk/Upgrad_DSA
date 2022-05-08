package Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want to put: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before" + Arrays.toString(numbers));

        mergeSort(numbers);

        System.out.println("After" + Arrays.toString(numbers));
        sc.close();

    }

    private static void mergeSort(int[] numbers) {
        int inputLength = numbers.length;
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = numbers[i];
        }
        for (int i = midIndex; i < numbers.length; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merging
        Merge(numbers, leftHalf, rightHalf);

    }

    private static void Merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            } else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
