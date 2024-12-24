package step4.HashingSession;

import java.util.HashMap;

public class HashingSes0 {
    public static void main(String[] args) {
        //We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.

        int[] arr = {3,2,3,2,4,3};
        int maxFreq = Integer.MIN_VALUE; int maxElem = 0;
        int minFreq = Integer.MAX_VALUE; int minElem = 0;

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        for(HashMap.Entry<Integer, Integer> num : mp.entrySet()){
            if(num.getValue() >= maxFreq){
                maxFreq = num.getValue();
                maxElem = num.getKey();
            }

            if(num.getValue() <= minFreq){
                minFreq = num.getValue();
                minElem = num.getKey();
            }
        }

        System.out.println("Max frequency element: " + maxElem + " with frequency: " + maxFreq);
        System.out.println("Min frequency element: " + minElem + " with frequency: " + minFreq);



        
    }
    
}
