package step4.HashingSession;

public class HashingSes10 {
    public static void main(String[] args) {
        // Session 10
        // Maximum Subarray Sum using Kadane's Algorithm. TC -> O(N). SC -> O(1) 

        // Traverse array from left to right
        // Sum elements one by one
        // If the curSum is negative, do not carry it forward intialize it to 0
        // If curSum is positive continue adding
        // If curSum is > maxSum. Update maxSum

        // whenever we intialize curSum to 0. It's like we're looking for new Subarray
        // So whenever we intialize curSum to 0. we set the start to i
        // and after finding curSum > MaxSum. Update MaxSum and set indexEnd to i
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        int indexStart = -1; int start = -1;
        int indexEnd = -1;

        for(int i=0; i<n; i++){

            if(curSum == 0) start = i;

            curSum = curSum + arr[i];

            if(curSum > maxSum){
                maxSum = curSum;
                indexStart = start; indexEnd = i;
            }

            if(curSum < 0){
                curSum = 0;
            }

        }

        System.out.println("Elements in Maximum Subbarray : ");
        for(int i = indexStart; i <= indexEnd; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Maximum Subarray Sum is: " + maxSum);


    }
    
}
