public class ThreadImplements implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i=0;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
        
    }
    public static void main(String[] args) {
        ThreadImplements t = new ThreadImplements();
        Thread th=new Thread(t);
        int i=0;
        while(true){
            System.out.println(i+"World");
            i++;
        }

    }
    
}
