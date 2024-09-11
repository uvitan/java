//DELETE
import java.io.File;

public class FileDelete {

    public static void main(String[] args) {
        // Specify the path of the file you want to delete
        File file = new File("D:\\UVI\\newfile.txt");

        // Attempt to delete the file
        if (file.delete())
          {
            System.out.println("File deleted successfully.");
        } 

   else {
            System.out.println("File does not exist or could not be deleted.");
        }
    }
}
