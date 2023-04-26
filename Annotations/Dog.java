import java.util.*;
public class Dog extends Animals {
    @Override
    public  void displayAll(){
    System.out.println("I'm dog");    
    }


     @Deprecated
   // @SuppressWarnings("unchecked")
    public void  setPath(){
        ArrayList list=new ArrayList();  
        list.add("sonoo");  
        list.add("vimal");  
        list.add("ratan");  
    

    for(Object obj:list)  
System.out.println(obj);  
    
    }

    
    
}
