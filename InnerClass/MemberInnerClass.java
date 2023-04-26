public class MemberInnerClass {
    int n=10;
    public class Inner{
        void display(){
            System.out.println("The message wil be displayed");
        }
    }
    public static void main(String[] args) {
       MemberInnerClass obj = new MemberInnerClass();
       MemberInnerClass.Inner IN = obj.new Inner();
       IN.display();
    }
    
}
