package hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class JimOrders {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/jim-and-the-orders/problem

        //S1: Add order no + prep time to get deliveryTime
        //S2: Store delivery time with custid (orderid) into hashmap
        //S3: Sort Array for Delivery time
        //S4: Traverse the array & get respective customer id

        int n = 3;
        int[] order = {1, 2, 3};
        int[] prep = {3, 3, 3};

        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int[] delivery = new int[n];
        for(int i=0; i<n; i++){
            int deliveryTime = order[i] + prep[i];
            delivery[i] = deliveryTime;
            mp.put(deliveryTime, i+1);
        }

        Arrays.sort(delivery);
        for(int i=0; i<n; i++){
            int val = delivery[i];
            System.out.print(mp.get(val) + " ");    
        }

    }
    
}
