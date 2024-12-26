package step4.HashingSession;

import java.util.HashMap;
import java.util.Map;

//https://www.youtube.com/watch?v=xvNwoz-ufXA

public class HashingSes6 {
    public static void main(String[] args) {
        //Find count of number of subarrays with sum ==  k 

        int[] arr = {1,2,3,4,5};
        int k = 5;

        System.out.println("Num of subarrays with sum " + k + ": " + countSubarraysOptimized(arr, k));
    }

    public static int countSubarraysOptimized(int[] arr, int k){

        int sum = 0;
        int count = 0;

        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0,1);                        //understand the why? by dry run

        for(int num : arr) {
            sum += num;

            if(prefixSumCount.containsKey(sum - k)){
                count += prefixSumCount.get(sum - k);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }


        return count;
    }
    
}
