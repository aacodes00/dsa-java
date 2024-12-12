package hackerrank;

public class DivisibleSumPairs {
    //https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,1,2};
        int k = 3;
        int countOfPairs = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i] + arr[j])%k == 0){
                    countOfPairs++;
                    System.out.println("[" + arr[i] + " " + arr[j] + "]");
                }
            }
        }
        System.out.println(countOfPairs);

    }
    
}
