package step4.HashingSession;

import java.util.Arrays;

public class HashingSes9_BF {
    public static void main(String[] args) {
        // valid Anagrams or not
        // We want to check if count of all characters is Equal in both Strings, then these strings will be called Anagrams

        // Approach 1. Sorting 2 arrays, and than comparing
        // Approach 2. taking frequency arr and incrementing count while traversing string1 and decrementing while traversing string 2. If freq != 0 not valid anagram
        
        // Approach 1
        //TC -> O(n log n) -> due to sorting operation
        String s = "nayan";
        String t = "naayn";

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);


        boolean result = Arrays.equals(sChars, tChars);
        System.out.println(result);
        
    }
    
}
