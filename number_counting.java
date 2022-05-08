public class number_counting {
    public static void find_frequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 1;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " -> " + arr[i] / arr.length);
        }
    }

    public static int findOddOccuring(int[] arr) {
        int num = 0;
        for (int i : arr) {
            num = num ^ i;
        }
        return num;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 3, 2, 5, 5, 7 };
        int[] arr2 = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };

        find_frequency(arr);
        System.out.println(findOddOccuring(arr2));
    }

}
