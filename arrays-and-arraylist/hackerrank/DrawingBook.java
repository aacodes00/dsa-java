package hackerrank;

public class DrawingBook {
    public static void main(String[] args) {
        int numOfPages = 5;
        int targetPage = 4;

        int flipToReachEnd = numOfPages/2;
        int flipToReachTargetfromFront = targetPage/2;
        int flipToReachTargetfromBack = flipToReachEnd - flipToReachTargetfromFront;

        int ans = Math.min(flipToReachTargetfromFront, flipToReachTargetfromBack);
        System.out.println(ans);
    }
    
}
