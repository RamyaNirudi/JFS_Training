import java.util.Scanner;

public class Task11_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows1 = 2, cols1 = 3;
        int rows2 = 3, cols2 = 2;

        int[][] a = new int[rows1][cols1];
        int[][] b = new int[rows2][cols2];
        int[][] product = new int[rows1][cols2];

        System.out.println("Enter elements of 2x3 matrix A:");
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols1; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of 3x2 matrix B:");
        for (int i = 0; i < rows2; i++)
            for (int j = 0; j < cols2; j++)
                b[i][j] = sc.nextInt();

        // Matrix Multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of A and B:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++)
                System.out.print(product[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
