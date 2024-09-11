//READER
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        
        File file = new File("D:\\UVI\\newfile.txt");

        readFile(file);
    }

    // Method to read data from a file
    public static void readFile(File file)
 {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Reading data from the file:");
            
        while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 

catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
