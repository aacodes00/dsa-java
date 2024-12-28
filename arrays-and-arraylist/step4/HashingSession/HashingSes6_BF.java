package step4.HashingSession;

public class HashingSes6_BF {

    public static int countSubarraysWithSumK(int[] arr, int k){
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){ //Outer Loop
            int currentSum = 0;

            //Print subarrays -> just for understanding
            for(int j=i; j<n; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.print("- - - > ");


            for(int j=i; j<n; j++){ //Inner Loop

                currentSum += arr[j];
                System.out.print("cs:" + currentSum + " ");

                if(currentSum == k){
                    count++;
                }
            }
            System.out.println();
        }

        return count;
    }
    public static void main(String[] args) {
        //Find count of number of subarrays with sum ==  k 
        //Brute Force Approach
        int[] arr = {1,2,3,4,1};
        int k = 5;

        System.out.println("Num of subarrays with sum " + k + ": " + countSubarraysWithSumK(arr, k));        
    }
    
}
