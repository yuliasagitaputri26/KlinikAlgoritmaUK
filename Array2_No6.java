package pertemuan4;

import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = yu.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = yu.nextInt();
        }

        boolean identik = true;

        for (int i = 0; i < n; i++) {
            if (A[i] != B[i]) {
                identik = false;
                break;
            }
        }
        if (identik) {
            System.out.println("Identik");
        } else {
            System.out.println("Tidak Identik");
        }
    }
}
