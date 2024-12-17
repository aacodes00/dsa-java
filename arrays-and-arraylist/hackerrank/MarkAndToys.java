package hackerrank;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/mark-and-toys/problem?isFullScreen=false
        
        int[] toyPrices = {1, 12, 5, 111, 200, 1000, 10};
        int currValue = 0;
        int countOfToys = 0;
        int budget = 50;

        Arrays.sort(toyPrices);

        for(int i=0; i<toyPrices.length; i++){
            currValue += toyPrices[i];

            if(currValue < budget){
                countOfToys++;
            } else {
                break;
            }
        }

        System.out.println(countOfToys);
    }
    
}
