package hackerrank;

public class CountValleys {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/counting-valleys/problem

        String v = "DDUUUUDD";

        int level = 0;
        int valley_count = 0;

        for(int i=0; i<v.length(); i++){
            if(v.charAt(i)=='U'){
                level++;
            } else if (v.charAt(i)=='D'){
                if(level==0) {
                    valley_count++;
                }
                level--;
            }
        }

        System.out.println("Count of valleys: " + valley_count);
    }
    
}
