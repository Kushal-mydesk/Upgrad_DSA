package Arrays;

import java.util.*;

public class numbers_of_ways {

    // this program solves how many ways are there to represent an integer
    // if 6 is input .
    /*
     * 6 can show like
     * 1+2+3 = 6
     * 1+5 = 6
     * 2+4 = 6
     * 6=6
     * 
     * output should be 4
     */

    public static int countWaysUtil(int x, int num) {
        int val = x - num;
        if (val == 0)
            return 1;
        if (val < 0)
            return 0;

        return countWaysUtil(val, num + 1) + countWaysUtil(x, num + 1);
    }

    public static int numberOfWays(int x) {
        return countWaysUtil(x, 1);
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfWays(n));
        sc.close();
    }
}
