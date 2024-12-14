package hackerrank;

public class ViralAds {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/strange-advertising/problem

        int days = 5;
        int startPeople = 5;
        int totalLikes = 0;

        for(int i=1; i<=days; i++){
            int share = (startPeople/2);
            totalLikes+=share;
            startPeople = share * 3;
        }

        System.out.println(totalLikes);
    }
    
}
