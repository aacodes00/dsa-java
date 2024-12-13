package hackerrank;

public class CatsMouse {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true
        
        int x = 1;              // Cat A posn
        int y = 3;              // Cat B posn
        int mouseLoc = 2;

        int catAposn = Math.abs(mouseLoc - x);
        int catBposn = Math.abs(mouseLoc - y);

        System.out.println(catAposn + " " + catBposn);

        if(catAposn == catBposn) {
            System.out.println("Mouse C");
        } else if (catAposn < catBposn) {
            System.out.println("Cat A");
        } else {
            System.out.println("Cat B");
        }

    }
    
}
