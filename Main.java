package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("enter the amount of rows of the desired matrix");
            int rows = inputs.nextInt();
            System.out.println("enter the amount of columns of the desired matrix");
            int cols = inputs.nextInt();

            int[] values = new int[rows * cols];
            System.out.println("enter the values in the matrix, left to right, top to bottom, space separated");
            for (int i = 0; i < rows * cols; i++) {
                values[i] = inputs.nextInt();
            }

            Matrix matrix = new Matrix(rows, cols, values);

            System.out.println(matrix.toString());

            run = false;
        }
    }
}
