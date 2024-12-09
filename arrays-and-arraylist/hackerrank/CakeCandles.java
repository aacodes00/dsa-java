package hackerrank;

public class CakeCandles {
    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
        
        int[] candleHeights = {3,2,1,3,4,4,4};

        int maxHeight = 0;
        int resultCandle = 0;

        for(int i=0; i<candleHeights.length; i++) {
            if (candleHeights[i] > maxHeight){ 
                maxHeight = candleHeights[i];
            }
        }

        for(int i=0; i<candleHeights.length; i++) {
            if (candleHeights[i] == maxHeight){ 
                resultCandle++;
            }
        }

        System.out.println("The tallest candles are " + maxHeight + " units." + " and there are " + resultCandle + " of them.");
    }
    
}
