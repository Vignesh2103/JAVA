public class PersonTest extends Person {
    public static void main(String[] args) {
        Person t = new Person() {

            @Override
            public void diaplay() {
                // TODO Auto-generated method stub
                System.out.println("Method Displayed");
                
            }
            
            
        };
        t.diaplay();
    }
}
