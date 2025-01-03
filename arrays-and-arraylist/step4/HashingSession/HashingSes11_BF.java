package step4.HashingSession;

public class HashingSes11_BF {
    public static void main(String[] args) {
        // You are given an array “A”; in one step select largest element of array and convert it to second largest element of the array 
        // Tell the minimum number of steps such that all elements become equal 
        
        int[] arr = {4,5,5,2,4};
        int n = arr.length;
        int steps = 0;

        // Repeat until all elements are equal
        while(true){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            // Find the minimum, maximum, and second maximum            
            for(int i=0; i<n; i++){
                if(arr[i] < min){
                    min = arr[i];
                }

                if(arr[i] > max){
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax && arr[i] < max){
                    secondMax = arr[i];
                }
            }

            // If all elements are equal to the minimum, we are done            
            boolean allEqual = true;
            for(int i=0; i<n; i++){
                if(arr[i] != min){
                    allEqual = false;
                    break;
                }
            }

            if(allEqual){
                break; // All elements are equal, we are done
            }


            // Replace all occurrences of the max with the secondMax
            for(int i=0; i<n; i++){
                if(arr[i] == max){
                    arr[i] = secondMax;
                    steps++;    //counting every step we're replacing
                }
            }
            
        }

        System.out.println(steps);

    }
    
}

//output: 6
// 2 steps required to convert two occurences of 5 to 4. Now we have element 4 with 4 occurences
// 4 steps required to convert 4 occurences of 4 to 2.
//i.e 2+4 = 6 steps


// You are given an array “A”; in one step select largest element of array and convert it to second largest element of the array 
// Tell the minimum number of steps such that all elements become equal  

// Observation :- All elements in final array will be equal to the smallest element of the array
