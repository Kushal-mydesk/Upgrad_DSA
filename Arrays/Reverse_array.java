package Arrays;

// It will reverse an Array
import java.util.*;

public class Reverse_array {
    static void rev_arr(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to put:");
        int nums = input.nextInt();
        int[] arr = new int[nums];

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter the elements to put on " + i + " : ");
            int variable = input.nextInt();
            arr[i] = variable;
        }
        System.out.println("Before reversing The array is:");
        print_arr(arr);
        rev_arr(arr);
        System.out.println("After reversing The array is:");
        print_arr(arr);
        input.close();
    }
}
