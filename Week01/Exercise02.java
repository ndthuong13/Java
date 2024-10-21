package Week01;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;

        if (n < 0) {
            n *= -1;
        }

        while (n > 0) {
            int dv = n % 10;
            n /= 10;
            result *= dv;
        }
        System.out.println(result);
    }
}
