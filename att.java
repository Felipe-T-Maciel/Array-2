import java.util.Scanner;

public class att {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 10;
        int[] A = new int[n], B = new int[n], C = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("O valor para 'A'");
            A[i] = scan.nextInt();
            System.out.println("O valor de 'B'");
            B[i] = scan.nextInt();

            C[i] = A[i] - B[i];
        }
        System.out.println("\n\n===============");
        System.out.println("   C = A - B");
        System.out.println("===============");
        for (int i = 0; i < n; i++) {
            System.out.println(C[i] + " = " + A[i] + " - " + B[i] + "\n");
        }
    }
}"# Array-2" 
