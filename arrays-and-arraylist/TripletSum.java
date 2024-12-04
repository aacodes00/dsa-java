public class TripletSum {
    public static void main(String[] args) {
        
        // Index     0 1 2 3 4 5
        int[] arr = {2,3,4,5,6,7};      //arr.length = 5

        int sumOfTriplet = 0;
        

        for(int i = 0; i<arr.length-2; i++){
            for(int j = i+1; j<arr.length-1; j++){
                for(int k = j+1; k<arr.length; k++) {
                    sumOfTriplet += arr[i] + arr[j] + arr[k];
                    System.out.print(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + sumOfTriplet);
                    System.out.println("");
                }
            }
        }

        System.out.println("Final Triplet Sum: " + sumOfTriplet);
    }
    
}
