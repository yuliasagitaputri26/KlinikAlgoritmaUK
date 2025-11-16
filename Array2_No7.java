package pertemuan4;

import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = yu.nextInt();
        }

        boolean terurut = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                terurut = false;
                break;
            }
        }
        if (terurut) {
            System.out.println("Array sudah terurut naik");
        } else {
            System.out.println("Array belum terurut naik");
        }
    }
}
