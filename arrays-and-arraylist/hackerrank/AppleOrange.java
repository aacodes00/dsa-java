package hackerrank;

public class AppleOrange {
    public static void main(String[] args) {
        //Apple Orange
        //https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

        int houseStart = 7; 
        int houseEnd = 11;

        int appleTreeLoc = 5;
        int orangeTreeLoc = 15;

        int[] distApples = {-2, 2, 1};
        int[] distOranges = {5, -6};

        int appleCount = 0;
        int orangeCount = 0;

        //Apples fallen on house
        for(int i=0; i<distApples.length; i++) {
            int fallenApple = distApples[i] + appleTreeLoc;             //tree locn + dist it travelled to fall on house

            if(fallenApple >= houseStart && fallenApple <= houseEnd) {  // if above sum is within house range, apple falls on house
                appleCount++;
            }
        }

        //Orange fallen on house
        for(int i=0; i<distOranges.length; i++) {
            int fallenOrange = distOranges[i] + orangeTreeLoc;

            if(fallenOrange >= houseStart && fallenOrange <= houseEnd) {
                orangeCount++;
            }
        }

        System.out.println(appleCount + " " + orangeCount);
    }
    
}
