import java.sql.SQLDataException;

public class Main{
    public static void main(String[] args) {
       try {
        int data =50/0;
        System.out.println(data);
       } 
       catch(ArithmeticException e){
        System.out.println(e);
       }
        catch(Exception e){
            System.out.println(e);

        } 
       
    }
}


