package com.company;

public class Operations {
    public Matrix addition(Matrix A, Matrix B) {
        int[] result = new int[A.getCols() * A.getRows()];

        if (A.getCols() == B.getCols() && A.getRows() == B.getRows()) {

            for (int i = 0; i < A.getCols() * A.getRows(); i++) {
                result[i] = A.getValues()[i] + B.getValues()[i];
            }
        }
        else {
            return null;
        }

        return new Matrix(A.getRows(), A.getCols(), result);
    }

    public Matrix subtraction(Matrix A, Matrix B) {
        int[] result = new int[A.getCols() * A.getRows()];

        if (A.getCols() == B.getCols() && A.getRows() == B.getRows()) {

            for (int i = 0; i < A.getCols() * A.getRows(); i++) {
                result[i] = A.getValues()[i] - B.getValues()[i];
            }
        }
        else {
            return null;
        }

        return new Matrix(A.getRows(), A.getCols(), result);
    }

    public Matrix multiplication(Matrix A, Matrix B) {
        int arows = A.getRows();
        int acols = A.getCols();
        int bcols = B.getCols();
        int brows = B.getRows();

        int[] result = new int[A.getRows() * B.getCols()];

        if (arows == bcols) {
            for (int i = 0; i < arows; i++) {
                for (int j = 0; j < bcols; j++) {
                    result[i+j] = calculateValue(A, B, i, j);
                }
            }
        }
        else {
            return null;
        }

        return new Matrix(A.getRows(), B.getCols(), result);
    }

    public int calculateValue(Matrix A, Matrix B, int x, int y) {
        return 0;
    }
}
