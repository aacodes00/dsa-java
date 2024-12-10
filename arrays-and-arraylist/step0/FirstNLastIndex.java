package step0;
public class FirstNLastIndex {

    public static void main(String[] args) {
        //First and last index of a target element

        int[] arr = {2,3,4,5,2,3};
        int targetElement = 2;

        int firstIndex = 0; boolean isFirstIndexSet = false;
        int lastIndex = 0; 

        for(int i=0; i<arr.length; i++){
            if(arr[i] == targetElement && isFirstIndexSet == false) {
                //First Occurence
                firstIndex = i;
                isFirstIndexSet = true;
            } else if (arr[i] == targetElement) {
                lastIndex = i;
            }
        }

        System.out.println("First Index of Target Element: " + firstIndex);
        System.out.println("Last Index of Target Element: " + lastIndex);        
    }
}