package Arrays;

//What 
/**
 * This question will help  with the array declaration , initialization , putting data inside an array, and retrieving it
 */

import java.util.*;

public class Array_demo {

    static void add_with_arr(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            int first_num = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int second_num = arr[j];

                if (first_num + second_num == sum) {
                    System.out.println(first_num + " : " + second_num);
                    return;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to put:");
        int nums = input.nextInt();
        int[] addition_arr = new int[nums];

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter the elements to put on " + i + " : ");
            addition_arr[i] = input.nextInt();
        }

        System.out.println("The final summation you want to find");
        int sum = input.nextInt();
        add_with_arr(addition_arr, sum);

        input.close();
    }
}
