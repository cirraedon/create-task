package com.company;

public class Operations {
    public static Matrix addition(Matrix A, Matrix B) {
        int aCols = A.getCols();
        int aRows = A.getRows();
        int bCols = B.getCols();
        int bRows = B.getRows();

        int[] result = new int[aRows * bCols];

        int[] avals = A.getValues();
        int[] bvals = B.getValues();

        if (aCols == bCols && aRows == bRows) {

            for (int i = 0; i < result.length; i++) {
                result[i] = avals[i] + bvals[i];
            }
        }
        else {
            return null;
        }

        return new Matrix(A.getRows(), A.getCols(), result);
    }

    public static Matrix subtraction(Matrix A, Matrix B) {
        int acols = A.getCols();
        int arows = A.getRows();
        int bcols = B.getCols();
        int brows = B.getRows();

        int[] result = new int[arows * bcols];

        int[] avals = A.getValues();
        int[] bvals = B.getValues();

        if (acols == bcols && arows == brows) {

            for (int i = 0; i < result.length; i++) {
                result[i] = avals[i] - bvals[i];
            }
        }
        else {
            return null;
        }

        return new Matrix(A.getRows(), A.getCols(), result);
    }

    public static Matrix multiplication(Matrix A, Matrix B) {
        int arows = A.getRows();
        int acols = A.getCols();
        int bcols = B.getCols();
        int brows = B.getRows();

        int[] avals = A.getValues();
        int[] bvals = B.getValues();

        int[] result = new int[arows * bcols];

        if (acols == brows) {
            int currindex = 0;
            for (int arow = 0; arow < arows; arow++) {
                for (int bcol = 0; bcol < bcols; bcol++) {
                    int total = 0;
                    for (int acol = 0; acol < acols; acol++) {
                        total += bvals[acol * bcols + bcol] * avals[arow * acols + acol];
                    }
                    result[currindex] = total;
                    currindex++;
                }
            }
        }
        else {
            return null;
        }

        return new Matrix(A.getRows(), B.getCols(), result);
    }

}
