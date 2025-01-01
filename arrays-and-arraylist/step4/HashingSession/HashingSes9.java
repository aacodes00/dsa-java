package step4.HashingSession;

import java.util.*;

public class HashingSes9 {
    public static boolean main(String[] args) {
        // Valid Anagram -> Optimized using Hashmap
        String s = "nayan";
        String t = "naayn";

        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for(char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for(char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for(int val : count.values()){
            if(val != 0){
                return false;
            }

        }
        return true;

    }
    
}
