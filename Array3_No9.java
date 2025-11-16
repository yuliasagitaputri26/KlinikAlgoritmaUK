package TugasP4;

import java.util.Scanner;

public class No9 {

    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        int n = yu.nextInt();
        
        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = yu.nextInt(); 
        }
        for (int i = 0; i < n; i++) {
            B[i] = yu.nextInt();
        }
        for (int i = 0; i < n; i++) {
           C[i] = A[i] + B[i]; 
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(C[i]);   
        }
    }
}
