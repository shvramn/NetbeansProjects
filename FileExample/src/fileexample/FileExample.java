
package fileexample;
import java.io.*;
public class FileExample {

    public static void main(String[] args) {
        try
        {
        FileOutputStream fos = new FileOutputStream("C:/Users/shvra/Test.txt");
        String str = "learn java programming";
        fos.write(str.getBytes());
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
