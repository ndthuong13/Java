package Week01;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
//        for(int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        int maxA = array[0];
        int maxB = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxA) {
                maxB = maxA;
                maxA = array[i];
            } else if (array[i] > maxB) {
                maxB = array[i];
            }
        }

        System.out.println(maxA + " " + maxB);

    }
}
