package step0;
public class FreqEachElement {
    public static void main(String[] args) {
        // Count frequency of each element

        //We're fixing one element and than from element+1 position till end looking for more occurences

        int[] arr = {1,1,4,2,1,4,6};
        int[] visitedArr = {0,0,0,0,0,0,0};

        for(int i = 0; i<arr.length; i++){
            if(visitedArr[i] == 0){                 //Checking if element is visited, if not visited than only move forward
                visitedArr[i] = 1;                  //Marking first Occurence as visited

                int count=1;                        //as first Occurence is already done, so count 1
                for(int j=i+1; j<arr.length; j++){  //traversing from i+1 position till end to see if same element occurs again
                    if(arr[i] == arr[j]){
                        visitedArr[j] = 1;          //marking visited
                        count++;                    //Increasing count
                    }
                }

                System.out.println("Occurence of element: " + arr[i] + " is " + count + " times.");
            }
            
        }

    }
    
}
