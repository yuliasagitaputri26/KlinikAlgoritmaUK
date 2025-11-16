package pertemuan4;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();
        int data[] = new int[n];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = yu.nextInt();
        }
        int dataAwal = data[0];
        for (int i = 0; i < n - 1; i++) {
            data[i] = data[i + 1];
        }
        data[n - 1] = dataAwal;
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
