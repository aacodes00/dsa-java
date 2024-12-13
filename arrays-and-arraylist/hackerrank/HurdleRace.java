package hackerrank;

public class HurdleRace {
    public static void main(String[] args) {
        
        // https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=false
        int[] height = {1,2,3,3,2,6};

        int k = 1;
        int max = 0;

        int result = 0;

        // Traversing the array
        for(int i=0; i<height.length; i++){
            if(height[i]>max){
                max = height[i];
            }
        }

        result = max - k;
        System.out.println("Doses required: " + result);

    }
    
}
