package step4.HashingSession;

public class SubArraysRevision {
    public static void main(String[] args) {
        //Revising Subarrays
        int[] arr = {1,2,3,4};
        int n = arr.length;

        System.out.println("Printing all possible subarrays: ");
        //Pick Starting Point
        for(int i=0; i<n; i++){
            //Pick Ending Point
            for(int j=i; j<n; j++){

                //Iterate between starting to ending point
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }
    }
    
}
