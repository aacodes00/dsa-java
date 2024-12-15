package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/permutation-equation/problem

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=1; i<=n; i++){
            int value = in.nextInt();
            mp.put(value, i);               //key, value
        }

        for(int i=1; i<=n; i++){
            int x = mp.get(i);
            int y = mp.get(x);
            System.out.print(y + " ");
        }
    }
    
}
