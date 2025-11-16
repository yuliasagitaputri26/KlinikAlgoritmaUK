package TugasP4;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);

        int n = yu.nextInt();
        int data[] = new int[n];

        int hasilgenap = 0;
        int hasilganjil = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = yu.nextInt();
            if (data[i] % 2 == 0) {
                hasilgenap++;
            } else {
                hasilganjil++;
            }
        }

        System.out.print(hasilgenap + " " + hasilganjil);
        System.out.println();
    }
}
