package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ClosestNumbers {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/closest-numbers/problem

        //1. Sort the arr and Create a Hashmap
        //2. Traverse the loop till arr.length - 1 (as you cannot compare last index with anyone) and find diff of arr[i+1] - arr[i]
        //3. In Hashmap, set the key -> index and value -> difference
        //4. Update the minimum difference
        //5. Traverse the map and check if particular index == minimumDifference it means index i and i+1 are part of the ans

        int minimumDiff = Integer.MAX_VALUE;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5); arr.add(2); arr.add(3); arr.add(4); arr.add(1);
        int n = arr.size();
        //1.
        Collections.sort(arr);

        HashMap<Integer, Integer> mp = new HashMap<>();
        //2. 3. 4.
        for(int i=0; i<n-1; i++) {
            int diff = arr.get(i+1) -  arr.get(i);
            mp.put(i, diff);
            minimumDiff = Math.min(minimumDiff, diff);
        }

        //5.
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(Integer key:mp.keySet()){
            if(mp.get(key) == minimumDiff){
                ans.add(arr.get(key));
                ans.add(arr.get(key+1));
            }
        }

        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }


    }
    
}
