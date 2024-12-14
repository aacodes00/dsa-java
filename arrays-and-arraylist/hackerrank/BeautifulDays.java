package hackerrank;

public class BeautifulDays {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

        int startDay = 20;
        int endDay = 23;
        int k = 6;

        int count = 0;

        for(int i=startDay; i<=endDay; i++){

            //Reversing the number
            int num = i;
            int rev = 0;

            while(num!=0){
                int rem = num%10;
                rev = rev*10+rem;
                num = num/10;
            }

            //Day - its reverse
            int diff = Math.abs(i-rev);

            //(day - reverse)/k = whole numm
            //If its a whole number, beautiful day. count++
            if(diff%k == 0){
                count++;
            }
        }

        System.out.println(count);
    }
    
}
