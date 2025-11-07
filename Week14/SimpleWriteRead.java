## File Handling in Java – Writing and Reading Numbers  
Demonstrates **file handling** in Java using `FileWriter`, `FileReader`, and `BufferedReader`.  
The program writes numbers from 1 to 10 into a file named **numbers.txt**, then reads and displays them on the console.  
Shows how to perform **sequential write and read operations** with proper stream handling.  
#Java #FileHandling #IOStreams #BufferedReader #FileWriter

  
import java.io.*;

class SimpleWriteRead {
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("numbers.txt");

    
        for (int i = 1; i <= 10; i++) {
            fw.write(i + "\n");
        }
        fw.close();
        System.out.println("Numbers written successfully\n");

        
        FileReader fr = new FileReader("numbers.txt");
        BufferedReader br = new BufferedReader(fr);

        String num;
        System.out.println("Numbers read from file:");
        while ((num = br.readLine()) != null) {
            System.out.println(num);
        }

        br.close();
        fr.close();
    }
}
