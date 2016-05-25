package by.epam.cdp.task_1_2;

import java.util.Scanner;

public class Matrix {

	public static int rows;
	public static int cols;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count rows of matrix:");
		rows = scanner.nextInt();
		System.out.println("Enter count columns of matrix:");
		cols = scanner.nextInt();

		int[][] matrix = new int[rows][cols];
		matrix = fillMatrix(matrix);
		printMatrix(matrix);
		System.out.println();
		printMatrix(transponMatrix(matrix));
		scanner.close();
	}

	private static int[][] fillMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		return matrix;
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] transponMatrix(int[][] matrix) {
		int[][] temporaryMatrix = new int[cols][rows];
		for (int i = 0; i < temporaryMatrix.length; i++) {
			for (int j = 0; j < temporaryMatrix[i].length; j++) {
				temporaryMatrix[i][j] = matrix[j][i];
			}
		}
		return temporaryMatrix;
	}
}
