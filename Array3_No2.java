package TugasP4;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int data[] = new int[n];
        data[0] = yu.nextInt();
        int max = data[0];
        int min = data[0];

        for (int i = 1; i < n; i++) {
            data[i] = yu.nextInt();

            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.print(min + " ");
        System.out.print(max);
        System.out.println();
    }
}
