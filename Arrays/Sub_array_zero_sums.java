package Arrays;

public class Sub_array_zero_sums {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, -5 };

        if (checkSum(arr)) {
            System.out.println("There is an subarray with sum 0");
        } else {
            System.out.println("There is no subarray with sum of 0");
        }

    }

    private static boolean checkSum(int[] arr) {
        int checksum = arr[0], start = 0, i;
        for (i = 1; i <= arr.length; i++) {
            while (checksum > 0 && start < i - 1) {
                checksum = checksum - arr[start];
                start++;
            }

            if (checksum == 0) {
                return true;
            }

            if (i < arr.length) {
                checksum = checksum + arr[i];
            }
        }
        return false;

    }
}
