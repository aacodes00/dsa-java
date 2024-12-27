package step4.HashingSession;

public class HashingSes7 {
    public static void main(String[] args) {
        //Find largest/smallest subarray with sum k in Given Array
        int[] nums = {1, 2, 3, 4, 5, -1, 6};

        // Target sum we want the subarray to match
        int k = 9;

        // Call the function to get the indices of the largest subarray that sums to k
        int[] result = largestSubarraySumK(nums, k);

        // Output the result based on the result array
        if (result[0] != -1) {
            // If a valid subarray was found, print its 1-based indices
            System.out.println("Largest subarray with sum " + k + " is from index " + result[0] + " to " + result[1]);
        } else {
            // If no subarray with sum k was found, print a message
            System.out.println("No subarray with sum " + k);
        }
    }

    // Function to find the largest subarray whose sum is equal to 'k'
    public static int[] largestSubarraySumK(int[] nums, int k) {
        // Initialize a variable to store the maximum length of a subarray found that sums to k
        int maxLen = 0;

        // Initialize result array to store the 1-based indices of the largest subarray, 
        // initially set to {-1, -1} to indicate no subarray found yet
        int[] result = {-1, -1};

        // Outer loop: Iterate through each possible starting index of the subarray
        for (int i = 0; i < nums.length; ++i) {
            
            // Variable to accumulate the sum of elements in the current subarray starting from index i
            int currentSum = 0;

            // Inner loop: Iterate through each possible ending index of the subarray starting at i
            for (int j = i; j < nums.length; ++j) {
                
                // Add the current element to the current subarray sum
                currentSum += nums[j];

                // If the current sum equals 'k' and the length of the subarray (j - i + 1) is larger than maxLen
                if (currentSum == k && (j - i + 1) > maxLen) {
                    
                    // Update the maximum length of the subarray
                    maxLen = j - i + 1;
                    
                    // Store the 1-based index of the subarray's start and end positions
                    result[0] = i + 1;  // Store the starting index (1-based)
                    result[1] = j + 1;  // Store the ending index (1-based)
                }
            }
        }

        // Return the result array with the indices of the largest subarray
        return result;
    }
    
}
