import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readthefile {
    public static void main(String[] args) {
         try {
            File myfile=new File("nidhi.txt");
            Scanner Reader = new Scanner(myfile);        
            // Traversing File Data
          	while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
          
            Reader.close();
        }
        
        // Exception Cases
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    
}
