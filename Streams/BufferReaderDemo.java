import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        // FileReader file = new FileReader("source.txt");
        // BufferedReader buffer = new BufferedReader(file);
        BufferedReader buffer = new BufferedReader(new FileReader("source.txt"));
        System.out.print((char)buffer.read());
        System.out.print((char)buffer.read());
        System.out.print((char)buffer.read());
        System.out.print((char)buffer.read());
        buffer.mark(10);
        System.out.print((char)buffer.read());
        System.out.print((char)buffer.read());
        buffer.reset();
        System.out.print((char)buffer.read());
        System.out.print((char)buffer.read());
        System.out.println((String) buffer.readLine());
    }
    
}
