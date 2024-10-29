package lista4;
import java.util.Scanner;

public class lista4ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("digite valores para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("digite valores para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            C[i] = A[i] * B[i];
        }

        System.out.println("resultado da multiplicação Vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        scanner.close();
    }
}