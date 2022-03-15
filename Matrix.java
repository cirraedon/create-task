package com.company;

public class Matrix {
    private int rows, cols;

    private int[] values;

    private boolean isSquare;

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] newValues) {
        this.values = newValues;
    }

    public Matrix(int r, int c, int[] vals) {
        this.rows = r;
        this.cols = c;
        this.values = vals;
        this.isSquare = (rows == cols);
    }

    @Override
    public String toString() {
        StringBuilder matrix = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            matrix.append("[ ");
            for (int j = 0; j < cols; j++) {
                matrix.append(values[i * cols + j]).append(" ");
            }
            matrix.append("]\n");
        }

        return matrix.toString();
    }
}
