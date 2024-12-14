package hackerrank;

public class UtopianTree {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/utopian-tree/problem

        int n = 5;          //year of growth cycles
        int height = 1;

        
        System.out.println("Period   Height");
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                //even  => summer increase by 1
                height++;
            } else {
                //odd   => spring it doubles
                height = height * 2;
            }
            System.out.println("   " + i + "       " + height);
        }

        //System.out.println(height); => final o/p
    }
    
}
