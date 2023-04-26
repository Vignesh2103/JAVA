import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * File
 */
public class File {

    public static void main(String[] args) throws IOException {
        try (FileOutputStream file = new FileOutputStream("test.txt")) {
            FileInputStream filex = new FileInputStream("test.txt");
            try (FileOutputStream source = new FileOutputStream("source.txt")) {
                FileInputStream source1= new FileInputStream("source.txt");
                String str = "LEARN JAVA PROGRAMMING";
                file.write(str.getBytes());
                int x;
                // do {
                // x= filex.read();
                // if(x != -1)
                // System.out.print((char)x);
                // } while (x != -1);
                
                while ((x = filex.read()) != -1) {
                    if(x>=65 && x<=90)
                        source.write(x+32);
                }
                
                while((x = source1.read()) != -1){
                    System.out.print((char)x);
                }
            }
        }
    }

    
}