import java.util.Scanner;

public class IntroToArray {
    public static void main(String[] args) {
        
        // Declaring an Array
        int[] array = new int[4];

        try (// Taking the Input 
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 4 elements of Array: ");
            for (int i=0; i<array.length; i++)
            {
                array[i] = sc.nextInt();
            }
        }

        // Printing contents of Array
        System.out.println("Array elements are: ");
        int size = array.length;
        for (int i=0; i<size;i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}