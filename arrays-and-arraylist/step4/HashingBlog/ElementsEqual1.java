package step4.HashingBlog;

import java.util.HashMap;
import java.util.Map;

public class ElementsEqual1 {
    public static void main(String[] args) {
        //https://www.desiqna.in/part-6
        //Minimum operations to make all elements equal in an array.
        
        //Approach 1:  Hashing Approach
        //Store Frequencies in Hashmap (Takes O(N) TC)
        //Find Max Freq from Hashmap. Than (Num of elements - MaxFreq)

        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int freq = entry.getValue();
            if(freq > maxFreq) {
                maxFreq = freq;
            }
        }

        System.out.println("Num of Operations Required: " + (n - maxFreq));

    }
    
}

//TC -> O(N)        SC -> O(N)