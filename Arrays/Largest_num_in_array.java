package Arrays;

import java.util.*;

public class Largest_num_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to put:");
        int nums = input.nextInt();
        int[] votes = new int[nums];

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter the elements to put on " + i + " : ");
            int variable = input.nextInt();
            votes[i] = variable;
        }
        largest(votes);
        input.close();
    }

    public static void largest(int[] votes) {
        int large = votes[0];
        int index = 0;
        for (int i = 0; i < votes.length - 1; i++) {
            if (large < votes[i]) {
                large = votes[i];
                index = i;

            }

        }
        System.out.println("The largest given number is: " + large + " at " + index + " position");

    }
}