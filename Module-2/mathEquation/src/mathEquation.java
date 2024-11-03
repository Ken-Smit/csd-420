/*Kenneth Smith 11-1-2024 Module 2*/

//Main Method
public class mathEquation {
    public static void main(String[] args) {
        //Print results
        System.out.println("The sum is: " + recursion(4));   // Expected output: 2.7167
        System.out.println("The sum is: " + recursion(9));   // Expected output: 7.0710
        System.out.println("The sum is: " + recursion(14));  // Expected output: 11.6818
    }

    //Recursion Method
    public static double recursion(int n) {
        if (n == 1) {
            return 0.5; // Base case: when n is 1, return 1/2
        } else {
            return (double) n / (n + 1) + recursion(n - 1); // Recursive case: add n/(n+1)
        }
    }
}