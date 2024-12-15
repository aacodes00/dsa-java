package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

public class CutSticks {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/cut-the-sticks/problem

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(4);
        arr.add(4);
        arr.add(2);
        arr.add(2);
        arr.add(8);

        int totalStick = arr.size();
        int curr = arr.get(0);
        int currCount = 0;
        
        //Step1: Sort array. (Helps to discard shortest)
        //Step2: Increase count. Check if next element is same. Add to count
        //Step3: If next element not same. 
        //  - Discard Prev Similar Elements from count
        //  - Mark the new element as current and increase the count

        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            if(curr == arr.get(i)){
                currCount++;
            } else {
                totalStick -= currCount;        
                curr = arr.get(i);
                currCount = 1;
                System.out.println(totalStick);
            }
        }
    }
    
}
