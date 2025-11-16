package pertemuan4;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int bilangan[] = new int[n];
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = yu.nextInt();
        }
        int positif = 0;
        int negatif = 0;
        int nol = 0;

        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == 0) {
                nol++;
            } else if (bilangan[i] > 0) {
                positif++;
            } else {
                negatif++;
            }
        }
        System.out.println("Positif : " + positif);
        System.out.println("Negatif : " + negatif);
        System.out.println("Nol : " + nol);
    }
}
