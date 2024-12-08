/*Kenneth Smith
420 Module 1
10-25-24
*/

//import classes necessary for program
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class DataWriter {
    public static void main(String[] args) {
        String filename = "KennethSmith.dat"; //Create file name
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            Random random = new Random();

            // Writing five random integers
            out.writeInt(5); // Write the length of the integer array
            for (int i = 0; i < 5; i++) {
                out.writeInt(random.nextInt(1000)); // Random integer between 0 and 999
            }

            // Writing current date
            Date currentDate = new Date();
            out.writeLong(currentDate.getTime()); // Store date as long (milliseconds)

            // Writing five random double values
            out.writeInt(5); // Write the length of the double array
            for (int i = 0; i < 5; i++) {
                out.writeDouble(random.nextDouble() * 1000); // Random double between 0.0 and 1000.0
            }

            //Write all the contents into one file
            System.out.println("Data written to file successfully.");
            //Display error message if the file doesn't write successfully
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}