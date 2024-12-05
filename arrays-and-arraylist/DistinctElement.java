public class DistinctElement {
    public static void main(String[] args) {
        //(Array element from 1 to 100) Count of distinct element
        int[] arr = {2,3,5,6,2,3,4};
        int[] visitedArr = {0, 0, 0, 0, 0, 0, 0};

        int countDistinctElement = 0;

        //Taking the value of array for eg 2
        //Marking that index in visitedArray as '1' i.e means visited
        //creating visited array of length: (maxelement of arr) + 1. as arr indexing starts from 0
        //it means if maxElement is 6, we create visitedArray of length 7. so that we can have index till 6,
        //which is our maxElement

        //If the visitedArr index is not visited i.e. '0'. It is first occurence of element
        //Mark it as distinct, and set visitedArr index as '1'
        //If already visited, Skip
        for(int i=0; i<arr.length; i++){
            if(visitedArr[arr[i]] == 0){
                visitedArr[arr[i]] = 1;
                countDistinctElement++;
                System.out.println("Distinct Element from Array: " + arr[i]);
            } 
        }

        //Printing visited array 
        System.out.println("");
        for(int j=0; j<visitedArr.length; j++)
        { 
            System.out.print(visitedArr[j] + " ");
        }
        System.out.println("");

        //Printing Distinct count 
        System.out.println("Count of Distinct Elements: " + countDistinctElement);


    }
    
}
