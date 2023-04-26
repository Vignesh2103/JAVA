public class Main {
    public static void main(String[] args) {
        Person vicky = new Person();
        if(vicky instanceof Themepark){
            System.out.println("Yes, He can enter into ThemePark");
        }
        else{
            System.out.println("No, He does'nt have a Permission");
        }
    }
    
}
