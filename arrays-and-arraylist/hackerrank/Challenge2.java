package hackerrank;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/tutorial-intro/problem?isFullScreen=true

        //Intro to Insertion Sort
        //Almost sorted arr, just last element in unsorted manner

        //S1: Create temp variable and store last element
        //S2: Start comparing (traverse) backwards i.e. from arrlength-2
        //S3: If temp var is greater than i(which is length-2 position), that means its it correct place (sorted) so place it in i+1 locn (which is last position)
        //S4: If temp var is smaller than i, push the current element (i.e. -> i) in i+1 position (backwards)
        //S5: If temp < arr[0], means temp var is smaller than start element. So set arr[0] = temp 


        //input arr = [1,2,4,5,3]
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int value = in.nextInt();
            arr[i] = value;
        }

        //S1
        int temp = arr[arr.length - 1];

        //S2
        for(int i=arr.length - 2; i>=0; i--){
            //S3
            if(temp >= arr[i]){
                arr[i+1] = temp;
                for(int j=0; j<n; j++){
                    System.out.print(arr[j] + " ");
                }
                break;

            }
            //S4
            arr[i+1] = arr[i];
            for(int j=0; j<n; j++){
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }

        //S5
        if(temp < arr[0]){
            arr[0] = temp;
            for(int j=0; j<n; j++){
                System.out.print(arr[j] + " ");
            }
        }
        
    }

}

//Output
// 1 2 4 5 3
// 1 2 4 5 5 
// 1 2 4 4 5 
// 1 2 3 4 5