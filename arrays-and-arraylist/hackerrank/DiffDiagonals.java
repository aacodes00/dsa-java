package hackerrank;

import java.util.*;

public class DiffDiagonals {
    public static void main(String args[]) {

        //https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the size of matrix: ");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];
        int row = matrix.length;
        int col = matrix[0].length;

        //Taking Matrix Input
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        //Printing Entered Matrix
        System.out.println("The Entered Matrix is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        //Sum of Diagonals
        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==j){                       
                    sumLeftDiagonal += matrix[i][j];
                    //System.out.println(sumLeftDiagonal);
                }

                if(i+j == matrix.length - 1){
                    sumRightDiagonal += matrix[i][j];
                    //System.out.println(sumRightDiagonal);
                }
            }
        }

        //Printing Result
        int diffDiagonalResult = Math.abs(sumLeftDiagonal) - Math.abs(sumRightDiagonal);
        System.out.println("Difference between diagonals is: " + Math.abs(diffDiagonalResult));

    }
}

// 00 01 02
// 10 11 12
// 20 21 22

//Left Diagonals [i][j] both index values are same
//Right Diagonals i+j == arr.length - 1