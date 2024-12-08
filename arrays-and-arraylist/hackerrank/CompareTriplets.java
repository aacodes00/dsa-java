package hackerrank;

import java.util.*;

public class CompareTriplets {
    public static void main(String args[]) {

        //https://www.hackerrank.com/challenges/compare-the-triplets/problem

        
        int[] aliceRating = new int[3];
        int[] bobRating = new int[3];
        int[] resultArr = new int[2];
        int aliceScore = 0; int bobScore = 0;
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        //Taking Inputs
        System.out.println("Enter alice rating: ");
        for(int i=0; i<aliceRating.length; i++){
            aliceRating[i] = in.nextInt();
        }

        System.out.println("Enter bob rating: ");
        for(int i=0; i<bobRating.length; i++){
            bobRating[i] = in.nextInt();
        }
        
        //Comparing based on logic to give scores
        for(int i=0; i<aliceRating.length; i++){
            if(aliceRating[i] > bobRating[i]){
                aliceScore++;
                resultArr[0] = aliceScore;
            } else if (aliceRating[i] < bobRating[i]) {
                bobScore++;
                resultArr[1] = bobScore;
            }
        }

        //Printing Result array
        for(int i=0; i<resultArr.length; i++){
            System.out.print(resultArr[i] + " ");
        }
        System.out.println("");      

    }
}


// If a[i] > b[i], then Alice is awarded 1 point.
// If a[i] < b[i], then Bob is awarded 1 point.
// If a[i] = b[i], then neither person receives a point.

// Example:
// a = [1, 2, 3]
// b = [3, 2, 1]

// For elements *0*, Bob is awarded a point because a[0] .
// For the equal elements a[1] and b[1], no points are earned.
// Finally, for elements 2, a[2] > b[2] so Alice receives a point.
// The return array is [1, 1] with Alice's score first and Bob's second.