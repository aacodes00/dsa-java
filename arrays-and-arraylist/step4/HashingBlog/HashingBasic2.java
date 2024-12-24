package step4.HashingBlog;
import java.util.Arrays;

public class HashingBasic2 {
    public static void main(String[] args) {
        //https://www.desiqna.in/5435/find-frequency-each-number-array-hashing-tutorials-part-desi
        
        int n = 9;
        int i = 0;

        int[] a = {1, 3, 3, 4, 1, 4, 4, 4, 4};
        
        int[] b = new int[9];
        Arrays.fill(b, 0);

        while(i < n){
            int x = a[i];
            b[x] = b[x] + 1;
            i++;
        }
        //Above for loop took O(n) time.
        //All frequencies have been calculated in advance by now.. :-) :-) 

        int[] queries = {3, 4, 1};
        int q = 3;
        int j = 0;

        while(j < q){
            int x = queries[j];
            System.out.println(x + ": occurs -> " + b[x] + " times."); //takes O(1) time
            j++;
        }
        System.out.println();

    }
    
}

// Time Complexity : As we are running a single for loop , O(N) time is required , to answer all the queries, 
// we iterate over the queries and answer each one of them in O(1) time as we have all the answers pre calculated :-) 
// So , total time taken : O(N+Q).

// Space Complexity : We created an extra array of size 'N' , which is array 'b' . So space taken is O(N) by the algorithm.
