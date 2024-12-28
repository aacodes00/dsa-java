package step4.HashingSession;

public class PrefixSumRevision {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;


        int[] prefix = new int[n];
        prefix[0] = arr[0];         //Intializing the first element

        //Making the prefix array
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        //Printing prefix array
        for(int i=0; i<n; i++){
            System.out.print(prefix[i] + " ");
        }
        System.out.println();

    }
    
}
