import java.util.Scanner;

public class Task10_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[][] matrix = new int[n][n];
        int primary = 0, secondary = 0;

        System.out.println("Enter elements of a 3x3 matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Calculating sums
        for (int i = 0; i < n; i++) {
            primary += matrix[i][i]; // primary diagonal
            secondary += matrix[i][n - 1 - i]; // secondary diagonal
        }

        System.out.println("Primary Diagonal Sum: " + primary);
        System.out.println("Secondary Diagonal Sum: " + secondary);

        sc.close();
    }
}
