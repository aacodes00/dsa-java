package hackerrank;

public class StaircasePattern {
    public static void main(String[] args) {
        //Staircase pattern

        // --#
        // -##
        // ###
        int n = 5;

        for (int i=1; i<=n; i++){
            //For spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //For hash
            for(int k=1; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
