package TugasP4;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();
        int data[] = new int[n];
        int hasil = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = yu.nextInt();
            if (data[i] > 0) {
                hasil += data[i];
            }
        }
        System.out.println(hasil);
    }

}
