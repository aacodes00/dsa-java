package step0;
public class TripletSumOddEven {
    public static void main(String[] args) {
        // Count of odd and even triplet sum
        int[] arr = {2,3,4,5,6};

        int sum = 0;

        int countOddSum = 0;
        int countEvenSum = 0;

        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    //Taking sum of Triplet Pair
                    sum = arr[i] + arr[j] + arr[k];

                    //Checking if pair is even or odd
                    if(sum % 2 == 0) {
                        System.out.println("Even Sum: " + arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + sum);
                        countEvenSum++;
                    } else {
                        System.out.println("Odd Sum: " + arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + sum);
                        countOddSum++;
                    }
                }
            }
        }

        System.out.println("Total Count of Even Triplet Pairs: " + countEvenSum);
        System.out.println("Total Count of Odd Triplet Pairs: " + countOddSum);
    }
    
}
