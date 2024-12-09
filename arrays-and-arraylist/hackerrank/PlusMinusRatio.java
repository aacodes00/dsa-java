package hackerrank;

public class PlusMinusRatio {
    public static void main(String[] args) {
    
        // https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
        int[] arr = {-4, 3, -9, 0, 4, 1};

        float pos = 0;
        float neg = 0;
        float zero = 0;

        int n = arr.length;

        for(int i=0; i<n; i++){
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0){
                neg++;
            } else {
                zero++;
            }
            
        }
        System.out.println(pos + " " + neg + " " + zero);

        pos /= n;
        neg /= n;
        zero /= n;

        System.out.println(String.format("%.6f", pos));
        System.out.println(String.format("%.6f", neg));
        System.out.println(String.format("%.6f", zero));

    }
}


// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.

// Example
// There are  elements, two positive, two negative and one zero.
// arr = [1,1,0,-1,-1]
// Results are printed as:
// 0.400000
// 0.400000
// 0.200000
