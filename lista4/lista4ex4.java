package lista4;

public class lista4ex4 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("elementos vetor:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }

        int contadorPares = 0;
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("\n\nquantidade de valores pares: " + contadorPares);
    }
}
