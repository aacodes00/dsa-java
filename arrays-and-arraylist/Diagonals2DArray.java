import java.util.ArrayList;

public class Diagonals2DArray {
    public static void main(String[] args) {
        
        //Left_diognal and right diagonal with repeating and without repeating

        // 00 01 02
        // 10 11 12
        // 20 21 22

        //Left Diagonals [i][j] both index values are same
        //Right Diagonals i+j == arr.length - 1

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> rightDiagonal = new ArrayList<Integer>();
        ArrayList<Integer> leftDiagonal = new ArrayList<Integer>();

        int row = arr.length;
        int col = arr[0].length;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++){
                if(arr[i] == arr[j])
                { 
                    leftDiagonal.add(arr[i][j]);
                }

                if(i+j == row-1){                           //For nonrepeating diagonal. Just change this condn as (i+j == row-1 && i!=j). Repeating diagonal index is [1][1]
                    rightDiagonal.add(arr[i][j]);
                }
            }
        }

        System.out.print("Left Diagonals are: ");
        for(int i=0; i<leftDiagonal.size(); i++){
            System.out.print(leftDiagonal.get(i) + " ");
        }
        System.out.println("");

        System.out.print("Right Diagonals are: ");
        for(int i=0; i<rightDiagonal.size(); i++){
            System.out.print(rightDiagonal.get(i) + " ");
        }
        System.out.println("");

    }
    
}
