package Arrays;

public class findMaximum1s {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 2, 0 },
                { 1, 1, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 }
        };

        System.out.println(findMaxmium1s(arr));
    }

    private static int findMaxmium1s(int[][] arr) {
        int rows = arr.length;
        int col = arr[0].length;
        int j, max_row_index = 0;
        j = col - 1;

        for (int i = 0; i < rows; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j = j - 1;
                max_row_index = i;
            }

        }

        if (max_row_index == 0 && arr[0][col - 1] == 0) {
            return -1;
        }
        return max_row_index;
    }
}
