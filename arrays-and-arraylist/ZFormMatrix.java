public class ZFormMatrix {
    public static void main(String[] args) {
        //Print the elements that forms z shape
        // 00 01 02    -> i==0
        // 10 11 12
        // 20 21 22    -> i==row-1
        // |      |
        //j==0  j==col-1

        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {4,5,6,7},
                        {6,7,8,9}};

        int row = arr.length;
        int col = arr[0].length;

        //First Row
        int i=0;
        for(int j=0; j<col-1; j++){
            System.out.print(arr[i][j] + " ");
        }

        //Right Diagonal
        for(int m=0; m<row-1; m++) {
            for(int n=0; n<col; n++){
                if(m+n == row-1){                           
                    System.out.print(arr[m][n] + " ");
                }
            }
        }

        //Last Row
        i = row-1;
        for(int j=0; j<row; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println("");

    }
    
}
