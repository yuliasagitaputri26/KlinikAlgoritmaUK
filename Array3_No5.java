package TugasP4;

import java.util.Scanner;
import java.util.Arrays;

public class No5 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();

        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = yu.nextInt();
        }

        Arrays.sort(data);

        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

    }

}
