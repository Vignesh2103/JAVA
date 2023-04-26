import java.io.File;
import java.io.IOException;

public class Create{
    /**
     * @param args
     */
    public static void main(String[] args) {
       
        try {
            File obj = new File("D:\\Vignesh\\Files\\Create.txt");
            if(obj.createNewFile()){
                System.out.println("The file Created "+obj.getName());
            }
            else{
                System.out.println("File already Created");
            }
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error Occured");
            e.printStackTrace();
        }
        
    }

}