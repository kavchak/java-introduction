package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter the number of matrix rows: ");
        int rows = Integer.parseInt(READER.readLine());

        System.out.println("Please enter the number of matrix columns: ");
        int cols = Integer.parseInt(READER.readLine());

        int[][] matrix = readMatrixFromInput(rows, cols);

        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("Original matrix: ");
        printMatrix(matrix);

        System.out.println("Transposed matrix: ");
        printMatrix(transposedMatrix);
    }

    private static int[][] readMatrixFromInput(int rows, int cols) throws IOException {
        int[][] matrix = new int[rows][cols];

        System.out.println("Please enter the matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(READER.readLine());
            }
        }

        return matrix;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
