package lista4;

import java.util.Scanner;

public class lista4ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] M = new int[10];

        System.out.println("digite 10 números inteiros:");
        for (int i = 0; i < M.length; i++) {
            M[i] = scanner.nextInt();
        }

        System.out.println("vetor original:");
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            int temp = M[i];
            M[i] = M[i + 5];
            M[i + 5] = temp;
        }

        // Exibindo o vetor modificado
        System.out.println("vetor modificado:");
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}