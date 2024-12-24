package step4.HashingBlog;

import java.util.HashMap;

public class SubsetCheck {
    public static void main(String[] args) {
        //https://www.desiqna.in/part-5

        int[] arr1 = {2, 4, 7, 1, 5, 5};
        int[] arr2 = {5, 4, 2};

        //Check if arr2 is subset of arr1 considering duplicates
        
        if(isSubset(arr1, arr2)){
            System.out.println("arr2 is subset of arr1.");
        } else {
            System.out.println("arr2 is NOT a subset of arr1");
        }
    }

    public static boolean isSubset(int[] arr1, int[] arr2){

        if(arr1.length < arr2.length) return false; //An array can't be a subset of an array smaller than it's own size

        //Fetching the frequency of element i in arr1 till now and increasing it by 1;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i : arr1){
            int countOfI = freqMap.getOrDefault(i, 0) + 1;
            freqMap.put(i, countOfI);
        }


        for(int i : arr2){
            if(!freqMap.containsKey(i) || freqMap.get(i) <= 0){
                // !freqMap.containsKey(i) -> key is not present means element was not present in arr1
                // freqMap.get(i) <= 0   -> as count is 0, means we've already traversed all occurences of this element and another occurence occured. means arr2 has more freq of this num than arr1

                return false; 
            }

            //Decrease the count of current element 
            freqMap.put(i, freqMap.get(i) - 1);

        }

    
        // If we get through all elements in arr2, arr2 is a subset of arr1
        return true;
    }
    
}
