public class SumMultiply {
    public static void main(){
        int[] arr = {10,12,14,15};
        int resultOfSum = 0, resultOfMultiply = 1;

        // Sum of Array
        int size = arr.length;
        for(int i=0; i<size; i++){
            resultOfSum = resultOfSum + arr[i];
        }
        System.out.println("Result of Sum: " + resultOfSum);

        // Multiplication of Array
        for(int i=0; i<size; i++){
            resultOfMultiply = resultOfMultiply * arr[i];
        }
        System.out.println("Result of Multiplication: " + resultOfMultiply);

    }
}