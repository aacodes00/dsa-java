package step0;
public class PrimeNumbersRange {
    public static void main(String[] args) {
        //Prime numbers between range

        //A number is prime when it is divisble by itself and by 1.
        //To check if num is prime or not, we can divide it from 1 till the number itself.

        //A prime number divisible count = 2 i.e. by itself and by 1

        //Example to find if 3 is prime or not.
        // 3%1, 3%2, 3%3. so it is only divisble by 1 and 3 ~prime 

        int range = 20;

        for(int i=1; i<=range; i++) //Outer loop to travel from every number in range
        {
            int count = 0;
            for(int j=1; j<=i; j++){ //Inner Loop to divide number from 1 to number itself
                if(i%j == 0) {
                    count++;
                }
            }

            //checking if divisibility count is equal to 2, if yes it's prime    
            if(count == 2) {
                System.out.print(i + " ");
            }
        }


    }
    
}
