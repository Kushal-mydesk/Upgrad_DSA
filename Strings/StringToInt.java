package Strings;

public class StringToInt {
    public static void main(String[] args) {
        String str = "12344";

        System.out.println(atoi(str, str.length()));
    }

    public static int atoi(String s, int length) {
        // write your code here
        String str = s;
        int finallength = length - 1;
        return stringtoint(str, finallength);
    }

    public static int stringtoint(String str, int length) {
        if (length == 0) {
            return str.charAt(length) - '0';
        }
        // Recursive call
        int smallans = stringtoint(str, length - 1);
        int a = str.charAt(length) - '0';
        return smallans * 10 + a;
    }
}
