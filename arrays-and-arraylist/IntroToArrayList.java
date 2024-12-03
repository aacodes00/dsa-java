import java.util.ArrayList;

public class IntroToArrayList {
    public static void main() {

        //Arraylist provides dynamic arrays. Has more methods than arrays.
        //Useful for data manipulation and easier insertions compared to arrays.

        //Creating Arraylist
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //Adding Elements
        arr.add(10);
        arr.add(20);
        arr.add(30);

        //Printing
        System.out.println(arr);


        //Creating ArrayList - String
        ArrayList<String> arr2 = new ArrayList<String>();

        //Adding Elements
        arr2.add("How");
        arr2.add("You?");

        System.out.println("Original List: " + arr2);

        //Adding Elements at specific index
        arr2.add(1, "Are");
        System.out.println("After adding element: " + arr2);

        //Remove Elements
        arr2.remove(0); //By Index
        arr2.remove("Are"); //By Value
        System.out.println("Elements removed: " + arr2);

        //Updating values
        arr2.set(0, "ArrayList");
        System.out.println("List after updation: " + arr2);

        //Getting Values
        String value = arr2.get(0);
        System.out.println(value);


        //https://www.geeksforgeeks.org/arraylist-in-java/

    }
}
