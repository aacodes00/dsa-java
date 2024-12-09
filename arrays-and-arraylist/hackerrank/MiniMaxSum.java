package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MiniMaxSum {
    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,3,1,6,8));
        Collections.sort(arr);

        int sum = 0;

        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
        }

        //to get max sum, we minus the smallest integer. It is on index 9 as arr is sorted
        //to get min sum, we minus the largest integer 
        int maxSum = sum - arr.get(0);
        int minSum = sum - arr.get(arr.size()-1);

        System.out.println(minSum + " " + maxSum);

    }
    
}

// Given five positive integers, find the minimum and maximum values that can be calculated 
// by summing exactly four of the five integers. 
// Then print the respective minimum and maximum values as a single line 
// of two space-separated long integers.
