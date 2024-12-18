package hackerrank;

public class HalloweenSale {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/halloween-sale/problem

        int p = 20;
        int d = 3;
        int m = 6;
        int s = 80;

        int sum = p;
        int count = 0;

        while(s>=sum){
            System.out.print(sum + " ");
            s -= sum;
            count++;
            sum=Math.max(m, sum-d);
        }

        System.out.println();
        System.out.println(count);
    }
    
}
