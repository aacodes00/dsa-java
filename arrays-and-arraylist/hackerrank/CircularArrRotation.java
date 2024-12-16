package hackerrank;

public class CircularArrRotation {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/circular-array-rotation/problem
        //           0 1 2
        int[] arr = {3,4,5};
        int [] newArr = {0,0,0};
        int n =  arr.length;

        int k = 2;              //No of Rotations
        int[] queries = {0,1,2};

        for(int i=0; i<n; i++){
            newArr[(i+k)%n] = arr[i];               //Formula to place at correct index is: (i+k)%n
        }

        for(int i=0; i<queries.length; i++){
            System.out.println(newArr[queries[i]] + " ");
        }
        
    }
    
}
