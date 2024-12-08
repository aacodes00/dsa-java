package hackerrank;

import java.util.*;

public class VeryBigSum {
    public static void main(String args[]) {
        //https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

        ArrayList<Long> arr = new ArrayList<Long>();
        int n = 0;
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        n = in.nextInt();

        System.out.println("Enter " + n + " elements: ");
        for(int i=0; i<n; i++){
            long num = in.nextLong();
            arr.add(num);
        }

        long sum = 0;
        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
        }
        System.out.println(sum);
    }
}


// Enter the array size: 
// 3
// Enter 3 elements: 
// 1000000001 1000000002 1000000003
// 3000000006