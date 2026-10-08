package TASK9;

import java.util.Scanner;

public class blocksum {
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int columns = mat[0].length;
        int[][] prefix = new int[rows + 1][columns + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        int[][] answer = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int top = Math.max(0, i - k);
                int left = Math.max(0, j - k);
                int bottom = Math.min(rows - 1, i + k);
                int right = Math.min(columns - 1, j + k);
                answer[i][j] = prefix[bottom + 1][right + 1]
                        - prefix[top][right + 1]
                        - prefix[bottom + 1][left]
                        + prefix[top][left];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] mat = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int[][] answer = matrixBlockSum(mat, k);
        for (int[] row : answer) {
            for (int j = 0; j < row.length; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(row[j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
