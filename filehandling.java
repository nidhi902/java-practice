
import java.io.*;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
import java.util.Scanner;
public class filehandling {
    public static void main(String[] args) {
        //creating a file
        File myfile=new File("nidhi.txt");
//         try{
//             myfile.createNewFile();
//         }catch(IOException e){
//             System.out.println("file cannot created");
//         }

         //writing in file
//         try{

//         FileWriter writing=new FileWriter("nidhi.txt");
//         writing.write("hello my name is niya");
//         writing.close();
//         }catch(IOException e){
//             e.printStackTrace();
//         }


//     {
        
        try {
            // File myfile=new File("nidhi.txt");
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
 

