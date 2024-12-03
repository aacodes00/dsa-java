public class SumEvenOddNum {
    public static void main(String[] args) {
        //sum of even numbers and odd numbers in a array

        int[] arr = {1,2,3,4,5};
        int sumEven = 0; 
        int sumOdd = 0;

        //Traversing through array
        for(int i=0; i<arr.length; i++){

            if(arr[i]%2==0){
                //It is even
                sumEven = sumEven + arr[i];
            } else {
                //Odd
                sumOdd = sumOdd + arr[i];
            }

        }

        //Printing
        System.out.println("Sum of Even Numbers: " + sumEven + 
                            ". Sum of Odd Numbers: " + sumOdd);

    }
    
}
