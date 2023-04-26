public class Student {  
    //instance variables of the class  
    int id;  
    String name;  
      
    Student(){  
    System.out.println("this a default constructor");  
    }  
      
    Student(int i, String n){  
    id = i;  
    name = n;
    System.out.println("Paramaterized Constructor");
    System.out.println("Student Id : "+id + "\nStudent Name : "+name);  


    }  
    Student(int id){
        System.out.println("Single Parameterized constructior");
        this.id=id;
    }
      
    public static void main(String[] args) {  
    //object creation  
    //  Student s = new Student();  
    
    Student s = new Student(7);
   
    // Student student = new Student(10, "David");  
    }  
    }  