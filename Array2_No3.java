package pertemuan4;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int bilangan[] = new int[n];

        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = yu.nextInt();

        }
        int x = yu.nextInt();
        System.out.print("Angka " + x + " ditemukan pada index: ");
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == x) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }
}
