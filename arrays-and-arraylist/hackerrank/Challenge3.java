package hackerrank;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/insertionsort2/problem
        //Full Insertion Sort


        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int val = in.nextInt();
            arr[i] = val;
        }

        for(int i=0; i<n-1; i++){
            int j = i+1;

            while(j>0){     
                if(arr[j]<arr[j-1]){        //means if [j-1 > j] i.e. greater number(eg at 0 index) and smaller num (at 1 index). when actually it should be opposite
                    int temp = arr[j];      //so we swap
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;                    //decrease j and keep on going till the element is not placed in perfect position
                } else {
                    break;                  //break when the element is placed in proper position
                }
            }

            //Printing output after every swap
            for(int k=0; k<n; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }
    
}

//Input:
// 7
// 3 4 7 5 6 2 1

//Output:
// 3 4 7 5 6 2 1 
// 3 4 7 5 6 2 1 
// 3 4 5 7 6 2 1 
// 3 4 5 6 7 2 1 
// 2 3 4 5 6 7 1 
// 1 2 3 4 5 6 7
