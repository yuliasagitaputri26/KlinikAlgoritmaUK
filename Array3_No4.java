package TugasP4;

import java.util.Scanner;

public class No4 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int bilangan[] = new int[n];
        int hasil = 0;
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = yu.nextInt();

        }
        int x = yu.nextInt();
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == x) {
                hasil++;    
            }
        }
        System.out.print(hasil + " ");
        System.out.println();
    }
}
