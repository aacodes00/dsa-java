package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MissingNumbers {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/missing-numbers/problem

        //int[] arr = {7,2,5,3,5,3};
        //int[] brr = {7,2,5,4,6,3,5,3};

        //1. Sort the Array
        //2. Traverse the second Array and create Hashmap with it's frequencies
        //3. Traverse the first Array. Take the element and if found in hashmap decrease it's count
        //4. In the end, in Hashmap whichever key is with value as 1, is the missing element or has less frequency compared to second arr

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(7); arr.add(2); arr.add(5); arr.add(3); arr.add(5); arr.add(3);

        ArrayList<Integer> brr = new ArrayList<Integer>();
        brr.add(7); brr.add(2); brr.add(5); brr.add(4); brr.add(6); brr.add(3); brr.add(5); brr.add(3);

        Collections.sort(arr);
        Collections.sort(brr);

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<brr.size();i++){
            if(mp.containsKey(brr.get(i))){
                mp.put(brr.get(i), mp.get(brr.get(i))+1);
            } else {
                mp.put(brr.get(i), 1);
            }
        }
        
        for(int i=0; i<arr.size(); i++) {
            if(mp.containsKey(arr.get(i))){
                mp.put(arr.get(i), mp.get(arr.get(i))-1);
            }
        }

        mp.forEach((k,v)->{
            if(v == 1){
                System.out.println(k + " ");
            }
        });
        
    }
    
}
