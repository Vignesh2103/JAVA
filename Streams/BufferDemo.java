import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("source.txt");
        BufferedInputStream buffer = new BufferedInputStream(file);
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
    }
}
