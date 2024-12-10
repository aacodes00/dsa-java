package step0;
public class TransposeMatrix {
    public static void main(String[] args) {
        
        //Transpose of matrix
        //Converting rows to columns
        //Reverse of index can turn a row into column position

        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        
        int row = arr.length;
        int col = arr[0].length;

        int[][] transposeArr = new int[row][col];
        int[][] transposeArr2 = new int[row][col];

        System.out.println("Transposed Array 1: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transposeArr[i][j] = arr[j][i];
                System.out.print(transposeArr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(" ");

        
        //Reversing the rows
        System.out.println("Transposed Array 2: ");
        for(int i=0; i<row; i++){
            for(int j=col-1; j>=0; j--){
                transposeArr2[i][j] = arr[i][j];
                System.out.print(transposeArr2[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
