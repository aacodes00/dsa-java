package step0;
public class Intro2DMatrix {
    public static void main(String[] args) {
        

        //rows = matrix.length
        //cols = matrix[0].length

        //Arr[row][col]

        //Traversing 2D Matrix
        // -- Row wise traverse --
        //i=0 till i<row Outer Loop
        //j=0 till j<col Inner Loop


        int [][] arr = {{1,2,3,4},{5,6,7,8},{6,5,6,8}};

        System.out.println("No of Rows in 2D Matrix: " + arr.length);
        System.out.println("No of Cols in 2D Matrix: "  + arr[0].length);

        //Traversing
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
