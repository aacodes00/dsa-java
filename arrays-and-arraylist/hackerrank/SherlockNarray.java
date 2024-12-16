package hackerrank;

public class SherlockNarray {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/sherlock-and-array/problem

        //1. Take total sum of arr
        //2. Take 1-1 element from array add it to current sum. Check if totalsum = currentSum.
        //      - If yes -> break (condition true).  If no -> Subtract the currElement from totalSum 
        //3. Continue till totalSum = currSum. If found print "YES" and if not found print "NO"   

        int[] arr = {5,6,8,11};
        int totalSum = 0;
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }

        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(currSum == totalSum){
                flag = true;
            }

            totalSum -= arr[i];
        }

        if(flag==true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    
}
