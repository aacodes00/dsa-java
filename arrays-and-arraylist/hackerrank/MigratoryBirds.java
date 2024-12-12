package hackerrank;

import java.util.HashMap;

public class MigratoryBirds {
    public static void main(String[] args) {
        int[] arr = {4,4,1,1,5,5,3};

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            } else {
                mp.put(num, 1);
            }
        }

        int mx=0;
        int ans=0;
        for(Integer key:mp.keySet()){
            int value=mp.get(key);
            if(value>mx){
                mx=value;
                ans=key;
            }
        }
     System.out.println(ans);
    }
    
}
