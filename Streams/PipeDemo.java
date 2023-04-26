import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os=o;
    }
    @Override
    public void run() {
        int count =1;
       while(true){
        try {
            os.write(count);
            os.flush();
            System.out.println("The Producer "+ count);
            System.out.flush();
            Thread.sleep(100);
            count++;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

       }
    }

}
class Consumer extends Thread{
    InputStream is;
    public Consumer (InputStream o){
        is=o;
    }
    @Override
    public void run() {
        int x;
        int count =1;
       while(true){
        try {
            x=is.read();
            System.out.println("The Consumer "+ x);
            System.out.flush();
            Thread.sleep(100);
            count++;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

       }
    }

}



public class PipeDemo {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();
        
    }
    
}
