public class Time_complexity_exercise {

    public static void main(String[] args) {
        printt(10);
    }

    static void printt(int n) {
        int s = 1;
        int i = 1;
        while (s < n) {
            i++;
            s = s + i;
            System.out.println("Hello");
        }
    }

}
