package hackerrank;

import java.util.HashMap;

public class SalesByMatch {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int color = arr[i];

            if(mp.containsKey(color)){
                mp.put(color, mp.get(color)+1);
            } else {
                mp.put(color, 1);
            }
        }

        int pair = 0;
        for(Integer key : mp.keySet()){
            int value = mp.get(key);

            pair = pair+(value/2);
        }
        System.out.println(pair);

    }
    
}
