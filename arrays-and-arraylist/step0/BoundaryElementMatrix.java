package step0;
public class BoundaryElementMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,4,5},{2,3,4,5},{6,7,8,9}};

        // 00 01 02 03    -> i==0
        // 10 11 12 13
        // 20 21 22 23    -> i == row-1(3-1=2)
        //  |       |
        //j==0    j==col-1 (4-1=3)

        int row = arr.length;
        int col = arr[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 || j==0 || i == row-1 || j == col-1){ //Conditions for border elements
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  "); //printing space for non-border elements
                }
            }
            System.out.println("");
        }
        
    }
    
}
