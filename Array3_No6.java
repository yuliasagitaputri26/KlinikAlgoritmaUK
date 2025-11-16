package TugasP4;

import java.util.Scanner;

public class No6 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int data[] = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = yu.nextInt();
        }

        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > terbesar) {
                terbesar = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] > terbesarKedua && data[i] < terbesar) {
                terbesarKedua = data[i];
            }
        }

        System.out.println(terbesarKedua);
    }
}
