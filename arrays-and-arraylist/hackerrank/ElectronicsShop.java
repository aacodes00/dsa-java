package hackerrank;

public class ElectronicsShop {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

        int budget = 60;
        int[] keyboard = {40,50,60};
        int[] drives = {5,8,12};

        int result = -1;    //If cannot buy both items, not in budget. Return -1

        //Getting Max amt that can be spent but is less than budget
        for(int i=0; i<keyboard.length; i++){
            for(int j=0; j<drives.length; j++){
                if(keyboard[i] + drives[j] > result && keyboard[i] + drives[j] < budget){
                    result = keyboard[i] + drives[j];
                }
            }
        }

        System.out.println(result);
        
    }
}