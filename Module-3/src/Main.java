/*Kenneth Smith 11-1-2024 Module 3*/
import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;

//main method
public class Main {

    // Method to remove duplicates from an ArrayList
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Use HashSet to remove duplicates, as it only keeps unique elements
        HashSet<E> uniqueElements = new HashSet<>(list);
        return new ArrayList<>(uniqueElements);
    }

    public static void main(String[] args) {
        // Create an ArrayList and fill it with 50 random values between 1 and 20
        ArrayList<Integer> originalList = new ArrayList<>();
        Random rand = new Random();//Generate random numbers

        //A loop too iterate through the numbers
        for (int i = 0; i < 50; i++) {
            originalList.add(rand.nextInt(21)); // random value from 1 to 20
        }

        // Print the original list
        System.out.println("Original List: " + originalList);

        // Remove duplicates
        ArrayList<Integer> uniqueList = removeDuplicates(originalList);

        // Print the list without duplicates
        System.out.println("Unique List: " + uniqueList);
    }
}

