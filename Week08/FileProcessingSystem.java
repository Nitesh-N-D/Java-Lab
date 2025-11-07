## File Processing System in Java  
Program to demonstrate **file handling and exception propagation** in Java.  
The program:  
- Reads content from a file (`text.txt`) using **FileReader** and **BufferedReader**  
- Demonstrates **method chaining** (`readFile → processFile → startProcessing`)  
- Uses **try–catch–finally** to handle `IOException` and ensure final block execution  
import java.io.*;
public class FileProcessingSystem {
    public static void readFile() throws IOException {
            FileReader fr=new FileReader("text.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println("File Content: " +br.readLine());
        br.close();
    }
    public static void processFile() throws IOException {
        readFile();
    }
    public static void startProcessing() throws IOException {
        processFile();
    }
    public static void main(String[] args) {
        try {
            startProcessing();
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        } finally {
            System.out.println("File processed and at final block.");
        }
    }
}
