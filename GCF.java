public class GCF {
    public static int gcf(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        if (num1 > num2) {
            return gcf(num1 - num2, num2);
        } else {
            return gcf(num1, num2 - num1);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcf(3, 51));
    }
}
