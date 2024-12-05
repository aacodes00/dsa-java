public class ReverseNumSum {
    public static void main(String[] args) {
        //Reverse numbers sum between range
        int startRange = 21;
        int endRange = 25;

        int sumOfReverse = 0;

        for(int i=startRange; i<=endRange; i++){
            int reverse = 0;
            int num = i;
            while(num > 0) {
                int rem = num % 10; //last digit
                reverse = reverse * 10 + rem;
                num = num/10; //trims end
            }
            System.out.print(reverse + " ");
            System.out.println("");
            sumOfReverse+=reverse;
        }

        System.out.println("Sum of Reverse: " + sumOfReverse);

    }
    
}
