package Strings;

public class Reverse_string {
    public static void main(String[] args) {
        String s = "kushal";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
