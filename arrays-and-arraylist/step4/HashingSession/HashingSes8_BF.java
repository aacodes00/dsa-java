package step4.HashingSession;

public class HashingSes8_BF {
    public static void main(String[] args) {
        //Find count of shortest/largest subarrays with sum k in given array --> Brute Force Approach
        int[] nums = {1,2,3,4,2,5};
        int k = 5;

        System.out.println("Shortest subarrays with sum " + k + ": " + countShortestSubarraysWithSumK(nums, k));
        System.out.println("Largest subarrays with sum " + k + ": " + countLargestSubarraysWithSumK(nums, k));
    }

    public static int countShortestSubarraysWithSumK(int[] nums, int k){
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum += nums[j];

                if(sum == k){
                    int length = j - i + 1;

                    if(length < minLength){
                        minLength = length;
                        count = 1;

                    } else if (length == minLength){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static int countLargestSubarraysWithSumK(int[] nums, int k){
        int n = nums.length;
        int maxLength = -1;
        int count = 0;

        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum += nums[j];

                if(sum == k){
                    int length = j-i+1;
                    
                    if(length > maxLength){
                        maxLength = length;
                        count = 1;
                    } else if (length == maxLength) {
                        count++;
                    }
                }

            }
        }

        return count;
    }
    
}
