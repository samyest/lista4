package lista4;

public class lista4ex2 {
    public static void main(String[] args) {
        int[] A = new int[10];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = (i + 1) * 10;
        }
        System.out.print("Vetor A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
    

