public class LocalInnerClass {
    public void display(){
        class Local{
            
            void display(){
                System.out.println("Hello");

            }
        }

        Local l = new Local();
        l.display();

    }
    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
        
    }
    
}
