package TugasP4;

import java.util.Scanner;

public class No8 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);

        int n = yu.nextInt(); 
        int k = yu.nextInt(); 
        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = yu.nextInt();
        }

        k = k % n; 

        for (int r = 0; r < k; r++) {
            int dataAwal = data[0];
            for (int i = 0; i < n - 1; i++) {
                data[i] = data[i + 1];
            }
            data[n - 1] = dataAwal;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
