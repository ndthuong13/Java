package Week01;

import java.util.Scanner;

public class Exercise01 {

    public static String convertToBase(int n, int b) {
        StringBuilder str = new StringBuilder();
        String list = "0123456789ABCDEF";

        if (n == 0) {
            return "0";
        }

        while (n > 0) {
            int r = n % b;
            str.insert(0, list.charAt(r));
            n = n / b;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt();
        String result = convertToBase(n, b);
        System.out.println(result);
    }

}
