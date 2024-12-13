package hackerrank;

public class DesignerPdfView {
    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
        // ascii value of 'a' is 97
        int[] arr = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        String word = "harsh";
        
        int mx = 0;
        for(int i=0; i<word.length(); i++){
            if(arr[word.charAt(i) - 97]>mx){
                mx = arr[word.charAt(i)-97];
            }
        }

        System.out.println(mx*word.length());        
    }
    
}
