package hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        //Time Conversion: Convert 12hr time into 24hr format
        //https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

        String time = "12:20:00PM";

        String onlyTime = time.substring(0,8);
        String[] timeArr = onlyTime.split(":");

        if(time.charAt(8)=='P'){
            //Conditions for PM
            if(timeArr[0].matches("12")){
                System.out.println(timeArr[0]+":"+timeArr[1]+":"+timeArr[2]);
            } else {
                timeArr[0] = String.valueOf(Integer.valueOf(timeArr[0])+12);
                System.out.println(timeArr[0]+":"+timeArr[1]+":"+timeArr[2]);
            }

        } else {
            //Conditions for AM
            if(timeArr[0].matches("12")){
                timeArr[0] = "00";
                System.out.println(timeArr[0]+":"+timeArr[1]+":"+timeArr[2]);
            } else {
                System.out.println(onlyTime);
            }
        }
        
    }
    
}
