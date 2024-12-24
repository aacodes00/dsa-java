package step4.HashingBlog;
import java.util.*;

public class HashingBasic {
    public static void main(String[] args) {
        //https://www.desiqna.in/5435/find-frequency-each-number-array-hashing-tutorials-part-desi

        int[] a = {1, 3, 3, 4, 1, 4, 4, 4, 4};
        int n = a.length;

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int l=0; l < q; q++){
            int qry = in.nextInt(); //query
            int frq = 0;


            for(int j=0; j<n; j++){ //iteration for each query
                if(a[j] == qry){
                    frq++;
                }
            }


            System.out.println("'"+ qry + "'" + ": number occurs " + frq + " times in the given array");
        }
        
    }
}


// Time Complexity : This method iterates over the full array of size 'N' for each of the 'Q' queries, 
// so the time complexity will be O(N*Q).