/**
 * ThreadExample
 */
public class ThreadExample extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}