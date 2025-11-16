package pertemuan4;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int a = yu.nextInt();
        int[] n = new int[a];

        for (int i = 0; i < n.length; i++) {
            n[i] = yu.nextInt();
        }
        int genap = 0;
        int ganjil = 0;
        for (int i = 0; i < n.length; i++) {
            if(n[i] % 2 == 0){
                genap++;
            }else{
                ganjil++;
            }
        }
        System.out.println("jumlah bilangan genap : " + genap);
        System.out.println("jumlah bilangan ganjil : " + ganjil);
    }
}
