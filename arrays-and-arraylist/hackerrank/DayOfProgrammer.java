package hackerrank;

public class DayOfProgrammer {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/day-of-the-programmer/problem
        
        int year = 2016;
        String date = "";

        if(year < 1918) {
            //Julian Calender
            //If leap     --> jan to aug (243 days) --> 256 - 244 = 12th day + Sept
            //If not leap --> jan to aug (243 days) --> 256 - 243 = 13th day + month (Sept)
            
            //Check if leap year or not
            date+=(year%4==0) ? "12.09."+year : "13.09." + year;


        } else if (year == 1918) {
            //Switch from julian to greg
            //Due to calender switch 1 to 13 Feb were skipped i.e. after jan 31 directly came 13 Feb. 
            //So to get 256th day of year, we need to add + 13 days i.e we get 26
            date+="26.09."+year;

        } else {
            //Georgian Calender
            //2 conditions for leap year: Divisible by 400. Divisible by 4 and not by 100
            //If leap     --> jan to aug (243 days) --> 256 - 244 = 12th day + Sept
            //If not leap --> jan to aug (243 days) --> 256 - 243 = 13th day + month (Sept)
            
            //Check if leap year or not
            date+=((year%400 == 0) || (year%4 == 0 && year%100!=0)) ? "12.09."+year : "13.09."+year;

        }

        System.out.println(date);


    }
    
}
