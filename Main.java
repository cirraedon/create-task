package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        boolean run = true;

        do {
            System.out.println("You will be prompted to enter two matrices, and then an operation.\n" +
                    "Please keep in mind that when the calculation happens, it will be calculated as\n" +
                    "Matrix A [operation] Matrix B\n" +
                    "so please enter the matrices in the appropriate order.");

            System.out.println("Enter the amount of rows of the first desired matrix");
            int firstRows = inputs.nextInt();
            System.out.println("Enter the amount of columns of the first desirezd matrix");
            int firstCols = inputs.nextInt();

            int[] firstValues = new int[firstRows * firstCols];
            System.out.println("Enter the values of the first matrix, left to right, top to bottom, space separated. \n" +
                    "Any and all extra numbers will be truncated, and not entered into the matrix.");
            for (int i = 0; i < firstRows * firstCols; i++) {
                firstValues[i] = inputs.nextInt();
            }

            Matrix firstMatrix = new Matrix(firstRows, firstCols, firstValues);


            System.out.println("Enter the amount of rows of the second desired matrix");
            int secondRows = inputs.nextInt();
            System.out.println("Enter the amount of columns of the second desired matrix");
            int secondCols = inputs.nextInt();

            int[] secondValues = new int[secondRows * secondCols];
            System.out.println("Enter the values of the second matrix, left to right, top to bottom, space separated. \n" +
                    "Any and all extra numbers will be truncated, and not entered into the matrix.");
            for (int i = 0; i < secondRows * secondCols; i++) {
                secondValues[i] = inputs.nextInt();
            }

            Matrix secondMatrix = new Matrix(secondRows, secondCols, secondValues);

            System.out.println(firstMatrix);
            System.out.println(secondMatrix);

            System.out.println("Are these the correct matrices? (enter 'yes' or 'no')");
            if (inputs.next().equals("no")) {
                continue;
            }

            boolean operationCompleted = false;

            String argtext = "What operation would you like to perform on these matrices? " +
                    "(only 'addition', 'subtraction' and 'multiplication' are available as of now)";
            Matrix result = null;

            while (!operationCompleted) {
                System.out.println(argtext);
                String inputArg = inputs.next();
                switch (inputArg) {
                    case "addition" -> {
                        operationCompleted = true;
                        result = Operations.addition(firstMatrix, secondMatrix);
                    }
                    case "subtraction" -> {
                        operationCompleted = true;
                        result = Operations.subtraction(firstMatrix, secondMatrix);
                    }
                    case "multiplication" -> {
                        operationCompleted = true;
                        result = Operations.multiplication(firstMatrix, secondMatrix);
                    }
                    default -> argtext = "That isn't one of the available operations. Please try again. " +
                            "\nWhat operation would you like to perform on these matrices? " +
                            "(only 'addition', 'subtraction' and 'multiplication' are available as of now)";
                }

            }


            if (result == null) {
                System.out.println("The operation could not be completed, " +
                        "either because the matrices were not compatible, " +
                        "or because something went wrong internally. Sorry!");
            }
            else {
                System.out.println("This is the resulting matrix:");
                System.out.println(result);
            }


            System.out.println("Do you have another set of matrices you need to work with? (enter 'yes' or 'no')");
            if (inputs.next().equals("no")) {
                run = false;
            }

        } while (run);
    }
}
