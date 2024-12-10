package step0;
public class SumOfPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sumOfPairs = 0;
        
        //Fixed i at one position. Then iterate j from i+1 till end
        //Then i++ and continue so on
         
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<arr.length; j++){
                sumOfPairs += arr[i] + arr[j];
            }
        }
        System.out.println("Sum of Pairs: " + sumOfPairs);
    }
    
}
