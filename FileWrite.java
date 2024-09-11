//WRITE
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) 
        {
               File file = new File("D:\\UVI\\newfile.txt");

             String data =(" hoiiiii");
                writeFile(file, data);
    }

      public static void writeFile(File file, String data) {
       
             try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
           
              writer.write(data);
            System.out.println("Data written to the file successfully.");
        }
            catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
