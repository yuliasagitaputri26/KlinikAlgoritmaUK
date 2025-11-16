package pertemuan4;

import java.util.Scanner;

public class Soal9 {

    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);

        int n = yu.nextInt();
        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = yu.nextInt();
        }

        boolean palindrom = true;

        int kiri = 0;
        int kanan = n - 1;

        while (kiri < kanan) {
            if (data[kiri] != data[kanan]) {
                palindrom = false;
                break;
            }
            kiri++;
            kanan--;
        }

        if (palindrom) {
            System.out.println("Array adalah palindrom");
        } else {
            System.out.println("Array bukan palindrom.");
        }
    }

}
