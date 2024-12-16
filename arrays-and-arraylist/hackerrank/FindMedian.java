package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

public class FindMedian {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/find-the-median/problem

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5); arr.add(3); arr.add(1); arr.add(2); arr.add(4);

        int n = arr.size();
        int medianIndex = n/2;

        Collections.sort(arr);
        System.out.println(arr.get(medianIndex));

    }
    
}
