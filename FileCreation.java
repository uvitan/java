//CREATION
import java.io.File;
import java.io.IOException;

public class FileCreationExample {

    public static void main(String[] args) {
       
        File file = new File("D:\\UVI\\newfile.txt");

        try {
           
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } 
          else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
          

            System.err.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
