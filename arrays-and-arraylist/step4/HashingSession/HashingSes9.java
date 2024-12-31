package step4.HashingSession;

import java.util.HashMap;
import java.util.*;

public class HashingSes9 {
    public static boolean main(String[] args) {
        // Valid Anagram -> Optimized using Hashmap
        String s = "nayan";
        String t = "naayn";

        Map<Character, Integer> count = new HashMap<>();

        for(char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for(char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        for(int val : count.values()){
            if(val != 0){
                return false;
            }

        }
        return true;

    }
    
}
