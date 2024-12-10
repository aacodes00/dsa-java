package step0;
public class SumEvenOddIndex {
    public static void main(String[] args) {
        //sum of even index and odd index in an array
        int[] arr = {1,2,3,4,5};
        int sumEvenIndex = 0;
        int sumOddIndex = 0;

        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                sumEvenIndex = sumEvenIndex + arr[i];
            } else {
                sumOddIndex = sumOddIndex + arr[i];
            }
        }
        
        System.out.println("Sum of Even Indexes: " + sumEvenIndex + 
                            ". Sum of Odd Indexes: " + sumOddIndex);
    }
    
}
