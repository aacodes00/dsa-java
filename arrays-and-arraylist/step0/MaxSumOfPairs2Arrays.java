package step0;
public class MaxSumOfPairs2Arrays {
    public static void main(String[] args) {
        //Maximum pair sum from two arrays

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,4,5};

        int sumOfArrays = 0;
        int maxSum = 0;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                sumOfArrays = arr1[i] + arr2[j];
                if(sumOfArrays > maxSum) {
                    maxSum = sumOfArrays;
                }
            }
        }

        System.out.println("Max Sum: " + maxSum);
    }
    
}
