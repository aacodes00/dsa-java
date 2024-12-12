package hackerrank;

public class BillDivision {
    public static void main(String[] args) {

        // https://www.hackerrank.com/challenges/bon-appetit/problem

        int[] foodBill = {3, 10, 2, 9};
        int annaNotPay = 1;             //Index for which she will not pay bill
        
        int annaPaid = 12;
        int annaRefund = 0;

        int correctBillSplit = 0;

        //Sum of all food bill and splitting
        for(int i=0; i<foodBill.length; i++){
            correctBillSplit += foodBill[i];
        }
        correctBillSplit = correctBillSplit - foodBill[annaNotPay]; //Sum - for which anna wont pay
        correctBillSplit = correctBillSplit/2;      //Avg
        //System.out.println(correctBillSplit);


        //Result
        if(annaPaid == correctBillSplit) {
            System.out.println("Bon Apettit");
        } else {
            annaRefund = annaPaid - correctBillSplit;
            System.out.println("Refund to Anna: " + annaRefund);
        }

    }
    
}
