// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

public class Parent {
   public void switchOn(){
    System.out.println("Parent switch On");
   }
   public void switchOff(){
    System.out.println("Parent switch Off");
   }

}
class Child extends Parent{
    @Override
    public void switchOn(){
        System.out.println("Child switch On");
    }
    @Override
    public void switchOff(){
        System.out.println("Child switch Off");
    }
    public void Browse(){
        System.out.println("Child Browsing");
    }
}
class Main{
    public static void main(String[] args) {
        Parent c = new Parent();
        c.switchOff();
        c.switchOn();
        
    }

}