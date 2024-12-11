package hackerrank;

public class BreakingRecords {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};

        int minimum = scores[0];
        int maximum = scores[0];

        int countMinimumIsReached = 0;
        int countMaximumIsReached = 0;


        for(int i=1; i<scores.length; i++){
            if(scores[i] > maximum){
                maximum = scores[i];
                countMaximumIsReached++;
            } else if (scores[i] < minimum) {
                minimum = scores[i];
                countMinimumIsReached++;
            }
        }

        System.out.println(countMaximumIsReached + " " +  countMinimumIsReached);
    }
    
}
