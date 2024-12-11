package hackerrank;

public class SubarrayDivision {
    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/the-birthday-bar/problem

        //Need to revise & reunderstand logic
        int[] s = {2,2,1,3,2};
        int d = 4;
        int m = 2;


        int count = 0;
        for(int i=0; i<s.length; i++){
            int sum = 0;
            int length_count = 0;

            for(int j=i; j<j+m; j++){
                if(j>=s.length || sum>=d) {
                    break;
                }
                sum+=s[j];
                length_count++;
            }

            if(sum==d && length_count==m){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
