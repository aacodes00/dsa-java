package hackerrank;

public class FindDigits {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/find-digits/problem

        int num = 1012;
        int count = 0;

        while(num!=0){
            int rem = num%10;       //Gives last digit of number
            if(rem != 0 && num%rem == 0){ // we do not divide by 0 && if divisble by digit we get 0
                count++;
            }
            num = num/10;   //Discards last digit of number
        }
        System.out.println(count);
    }
    
}
