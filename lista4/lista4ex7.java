package lista4;

import java.util.Scanner;

public class lista4ex7 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] X = new int[10];
    int[] Y = new int[10];

    System.out.println("digite 10 números inteiros para o vetor X:");
    for (int i = 0; i < 10; i++) {
        System.out.print("Elemento " + i + ": ");
        X[i] = scanner.nextInt();
    }

    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) { //  par
            Y[i] = X[i] * 2;
        } else { //  ímpar
            Y[i] = X[i] * 3;
        }
    }
    
    System.out.println("\nVetor Y:");
    for (int i = 0; i < 10; i++) {
        System.out.println("Y[" + i + "] = " + Y[i]);
    }

    scanner.close();
}
}


 