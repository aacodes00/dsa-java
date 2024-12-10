package step0;
public class SumOfPairs2Arrays {
    public static void main(String[] args) {
        //Sum of pairs using two arrays

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,4,5};
        int sumOfArrays = 0;

        //Printing Pairs
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                sumOfArrays += arr1[i] + arr2[j];
                System.out.print(arr1[i] + " + " + arr2[j] + " = " + sumOfArrays);
                System.out.println(" ");
            } 
        }

        System.out.println("Final Sum: " + sumOfArrays);
    }
    
}
