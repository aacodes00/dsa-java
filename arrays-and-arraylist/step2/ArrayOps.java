package step2;

import java.util.*;

public class ArrayOps {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        //taking Array input
        for(int i=0; i<n; i++){
            int value = in.nextInt();
            nums[i] = value;
        }

        //Logic for operation on arr
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        //Printing Array i.e. after above addition logic
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //Now, need to sort. i.e. Integers at start and Zero's at end. 

        //Count non-zero integers
        HashMap<Integer,Integer> nonZero = new HashMap<>();
        int nonZeroCount = 0;
        int key = 0;
        
        //Traversing through arr and counting nonzero integer and adding to hashmap
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                nonZero.put(key, nums[i]);
                nonZeroCount++;
                key++;
            }
        }

        //Adding nonzero integers at start
        for(int i=0; i<nonZeroCount; i++){
            nums[i] = nonZero.get(i);
        }

        //Filling remaining indexes by zero
        for(int i=nonZeroCount; i<n; i++){
            nums[i] = 0;
        }

        //Printing Results
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();


    }
    
}
