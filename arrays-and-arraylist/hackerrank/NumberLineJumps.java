package hackerrank;

public class NumberLineJumps {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/kangaroo/problem
        int k1Position = 0;
        int mJump1 = 2;

        int k2Position = 5;
        int mJump2 = 3;

        if(k2Position > k1Position && mJump2 > mJump1){
            System.out.println("NO");
            return;
        }

        if((k2Position - k1Position)%(mJump2 - mJump1) == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}



