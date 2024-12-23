package step4;

import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        //https://www.desiqna.in/part-8#google_vignette
        //Find out the pair from array whose sum forms the number 'x' when both the numbers of the pair are added

        int[] arr = {1, -2, -1, 1, 3};
        int x = 2;

        if(pairSum(arr, x) == -1){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static int pairSum(int[] arr, int x){

        HashSet<Integer> pairSet = new HashSet<>();

        for(int i=0; i<arr.length; i++){

            // Calculate the required number to form a pair that sums to x
            int temp = x - arr[i];

            // Check if the required number is already in the set
            if(pairSet.contains(temp)){
                return 0; // Pair found, return 0
            }

            // Add the current element to the set
            pairSet.add(arr[i]);
        }


        return -1; // No pair found, return -1s
    }
    
}

//TC -> O(n) -> as using hashmap to store data requires O(n)
//SC -> O(n) -> as no other additional storage is needed