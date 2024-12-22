package step4;

import java.util.HashMap;

public class DuplicateKDistance {
    public static void main(String[] args) {
        //https://www.desiqna.in/part-7
        //Check if duplicate exist within 'k' distance

        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int k = 3;
        int n = arr.length;

        boolean duplicateExist = false;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array from left to right
        for (int i = 0; i < n; i++) {
            // Check if the element is present in the map
            if (map.containsKey(arr[i])) {
                // If the element is already present, check the condition
                if (i - map.get(arr[i]) <= k) {
                    duplicateExist = true; // Duplicate found within distance k
                }
            }
            // Insert/update the element with its index
            map.put(arr[i], i);
        }

        
        System.out.println(duplicateExist);
    }
    
}
