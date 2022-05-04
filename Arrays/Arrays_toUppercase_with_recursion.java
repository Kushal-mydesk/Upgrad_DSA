package Arrays;

import java.util.*;

public class Arrays_toUppercase_with_recursion {
    public static String[] convertToUpper(String[] arr, int n) {
        if (n == -1) {
            return arr;
        } else {
            int i = n;
            arr[i] = arr[i].toUpperCase();
            return convertToUpper(arr, n - 1);
        }
    }

    // this Function helps to do the uppercase switching with one arguement(but its
    // only working with inline defined array. not with user-define array)
    public static String[] convertToUpper(String[] arr) {
        if (arr.length - 1 < 0) {
            return arr;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i].toUpperCase();
        }
        String[] arr2 = Arrays.copyOf(arr, arr.length - 1);
        return convertToUpper(arr2);
    }

    // this one arguement with work on every derfined array
    /*
     * public static String[] ConvertToUpper(String[] arr) {
     * // Add code here
     * return toUpperCase(arr, 0);
     * 
     * }
     * 
     * 
     * public static String[] toUpperCase(String[] arr, int idx) {
     * if (arr.length <= idx) {
     * return arr;
     * }
     * arr[idx] = arr[idx].toUpperCase();
     * return toUpperCase(arr, idx + 1);
     * }
     */

    public static void main(String[] args) {

        String[] arr = { "mango", "apple", "lemon", "banana", "lichies", "PineApple" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter how many ele:  ");

        int n = sc.nextInt();

        String[] arr2 = new String[n];

        for (int i = 0; i <= n; i++) {
            arr2[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr2));
        convertToUpper(arr);
        String[] res = convertToUpper(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println("This is res: " + Arrays.toString(res));
        sc.close();

        /*
         * for (int i = 0; i < res.length; i++) {
         * System.out.println(res[i]);
         * }
         * String[] res2 = convertToUpper(arr);
         * for (int i = 0; i < res2.length; i++) {
         * System.out.println("Res2" + res2[i]);
         * }
         * String[] res3 = ConvertToUpper(arr);
         * for (int i = 0; i < res3.length; i++) {
         * System.out.println(res3[i]);
         * }
         * 
         */
    }
}
