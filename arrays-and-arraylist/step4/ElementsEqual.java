package step4;

public class ElementsEqual {
    public static void main(String[] args) {
        //https://www.desiqna.in/part-6
        //Minimum operations to make all elements equal in an array.
        
        //Approach 1:  Brute Force

        //To make all elements equal, we need to find element which has max frequency and than convert other element to that element
        //So to find max freq we need to run two loops. Outer loop -> fix element. Inner Loop -> Count its frequency
        //If we get maxFreq, update it
        //Return "number of elements - frequency of most freq element". So we'll get no of operations required.

        int[] arr = {1,2,3,4};
        int n = 4;

        int maxFreq = 0;
        int currFreq = 0;

        for(int i=0; i<n; i++){
            currFreq = 1;

            for(int j=0; j<n; j++){
                if(i == j) continue;

                if(arr[j] == arr[i]){
                    currFreq++;
                }
            }

            if(currFreq > maxFreq) {
                maxFreq = currFreq;
            }
        }


        System.out.println("Minimum no of operations: " + (n - maxFreq));
    }
    
}


//Time Complexity
//O(n^2)  -> as we run two for loops
//Space Complexity -> O(1)