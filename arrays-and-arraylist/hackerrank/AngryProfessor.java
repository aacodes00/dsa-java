package hackerrank;

public class AngryProfessor {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/angry-professor/problem

        //Negative & 0  means students arrived on time
        //Positive >=1  means late
        
        int numOfStudents = 4;
        int threshold = 3;

        int[] arrivalTime = {-1,-3,2,4};
        int studOnTime = 0;
        
        for(int i=0; i<numOfStudents; i++){
            if(arrivalTime[i] <= 0){
                studOnTime++;
            }
        }

        if(studOnTime >= threshold) {
            System.out.println("CLASSES CONTINUE");
        } else {
            System.out.println("CLASSES CANCELLED");
        }
    }
    
}
