package task10;

import java.util.Scanner;

public class matrixlayerrotation {
    public static void matrixRotation(int[][] matrix, int r) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int layers = Math.min(rows, columns) / 2;

        for (int layer = 0; layer < layers; layer++) {
            int top = layer;
            int left = layer;
            int bottom = rows - 1 - layer;
            int right = columns - 1 - layer;
            int length = 2 * (bottom - top + right - left);
            int[] positions = new int[length];
            int index = 0;

            for (int j = left; j <= right; j++) {
                positions[index++] = top * columns + j;
            }
            for (int i = top + 1; i <= bottom; i++) {
                positions[index++] = i * columns + right;
            }
            for (int j = right - 1; j >= left; j--) {
                positions[index++] = bottom * columns + j;
            }
            for (int i = bottom - 1; i > top; i--) {
                positions[index++] = i * columns + left;
            }

            int[] values = new int[length];
            for (int i = 0; i < length; i++) {
                int position = positions[i];
                values[i] = matrix[position / columns][position % columns];
            }

            int shift = r % length;
            for (int i = 0; i < length; i++) {
                int position = positions[i];
                matrix[position / columns][position % columns] = values[(i + shift) % length];
            }
        }

        StringBuilder output = new StringBuilder();
        for (int[] row : matrix) {
            for (int j = 0; j < columns; j++) {
                if (j > 0) {
                    output.append(' ');
                }
                output.append(row[j]);
            }
            output.append('\n');
        }
        System.out.print(output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int r = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        matrixRotation(matrix, r);
        sc.close();
    }
}
