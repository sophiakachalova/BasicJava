package edu.ntu.pzks.lr2;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static class MatrixApp {
        private static final int MAX_SIZE = 20;
        private static final int MIN_RANDOM = -100;
        private static final int MAX_RANDOM = 100;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть висоту матриці (не більше 20): ");
            int rows = getValidSize(scanner);
            System.out.print("Введіть ширину матриці (не більше 20): ");
            int cols = getValidSize(scanner);

            System.out.print("Оберіть спосіб заповнення (1 - вручну, 2 - рандомно): ");
            int choice = scanner.nextInt();
            int[][] matrix = new int[rows][cols];

            if (choice == 1) {
                fillMatrixManually(scanner, matrix);
            } else {
                fillMatrixRandomly(matrix);
            }

            printMatrix(matrix);
            System.out.println("Мінімальний елемент: " + findMin(matrix));
            System.out.println("Максимальний елемент: " + findMax(matrix));
            System.out.println("Середнє арифметичне: " + calculateAverage(matrix));
        }

        private static int getValidSize(Scanner scanner) {
            int size;
            do {
                size = scanner.nextInt();
                if (size < 1 || size > MAX_SIZE) {
                    System.out.print("Некоректне значення! Введіть число від 1 до 20: ");
                }
            } while (size < 1 || size > MAX_SIZE);
            return size;
        }

        private static void fillMatrixManually(Scanner scanner, int[][] matrix) {
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print("Елемент [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }

        private static void fillMatrixRandomly(int[][] matrix) {
            Random random = new Random();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = MIN_RANDOM + random.nextInt(MAX_RANDOM - MIN_RANDOM + 1);
                }
            }
        }

        private static void printMatrix(int[][] matrix) {
            System.out.println("Матриця:");
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.printf("%5d", value);
                }
                System.out.println();
            }
        }

        private static int findMin(int[][] matrix) {
            int min = Integer.MAX_VALUE;
            for (int[] row : matrix) {
                for (int value : row) {
                    if (value < min) {
                        min = value;
                    }
                }
            }
            return min;
        }

        private static int findMax(int[][] matrix) {
            int max = Integer.MIN_VALUE;
            for (int[] row : matrix) {
                for (int value : row) {
                    if (value > max) {
                        max = value;
                    }
                }
            }
            return max;
        }

        private static double calculateAverage(int[][] matrix) {
            int sum = 0, count = 0;
            for (int[] row : matrix) {
                for (int value : row) {
                    sum += value;
                    count++;
                }
            }
            return (double) sum / count;
        }
    }

}
