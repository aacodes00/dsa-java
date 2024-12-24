package step4.HashingSession;

import java.util.HashMap;

public class HashingSes4 {
    public static void main(String[] args) {
        //Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0] 
        int[] b = {1,5,3,4,2};
        int k = 2;
        System.out.println(countPairsWithDifferenceK(b, k));

    }

    public static int countPairsWithDifferenceK(int[] b, int k){
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for(int j=0; j<b.length; j++) {
            if(freq.containsKey(b[j] - k)){
                count += freq.get(b[j] - k);
            }

            if(k != 0 && freq.containsKey(b[j] + k)){
                count += freq.get(b[j] + k);
            }

            freq.put(b[j], freq.getOrDefault(b[j], 0) + 1);
        }

        return count;
    }
    
}
