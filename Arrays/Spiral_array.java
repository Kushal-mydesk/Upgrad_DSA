package Arrays;

import java.util.Arrays;

public class Spiral_array {
    // First put in some boundaries

    public static int[] generateSpiralMatrix(int[][] arr) {
        int i = arr.length - 1, j = arr[0].length - 1;
        int[] result = new int[arr.length * arr[0].length];
        int z = 0;
        int m = 0, n = 0;
        while (m <= i && n <= j) {
            for (int k = n; k <= j; k++) {
                result[z++] = arr[m][k];
            }
            m++;
            for (int k = m; k <= i; k++) {
                result[z++] = arr[k][j];
            }
            j--;
            if (m <= i) {
                for (int k = j; k >= n; k--) {
                    result[z++] = arr[i][k];
                }
            }
            i--;
            if (n <= j) {
                for (int k = i; k >= m; k--) {
                    result[z++] = arr[k][n];
                }
            }
            n++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };
        int[] new_arr = generateSpiralMatrix(arr);
        System.out.println(Arrays.toString(new_arr));
    }

}
