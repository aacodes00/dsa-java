package hackerrank;

public class GradingStudent {
    public static void main(String[] args) {
        //Grading Students
        //https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

        //1st grade > 38 and grade % 5 >= 3 or not
        //If true, add +5 to grade and subtract with grade % 5
        //If false, keep the grade as it is

        int[] grades = {73, 67, 38, 33};
        int[] resultGrades = new int[grades.length];
        
        for(int i=0; i<grades.length; i++){
            if(grades[i] >= 38 && grades[i]%5 >= 3){
                resultGrades[i] = (grades[i] + 5) - (grades[i] % 5);
            } else {
                resultGrades[i] = grades[i];
            }
        }

        for(int i=0; i<resultGrades.length; i++) {
            System.out.print(resultGrades[i] + " ");
        }
        System.out.println();
    }
    
}
