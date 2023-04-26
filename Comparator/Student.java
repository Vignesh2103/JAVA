import java.util.Comparator;

public class Student implements Comparable<Student> {
    @Override
    public String toString() {
        return "rollno=" + rollno + ", age=" + age + ", name=" + name;
    }
    public Student(int rollno, int age, String name) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
    }
    
    int rollno;
    int age;
    String name;
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    // @Override
    // public int compareTo(Student o) {
    //     TODO Auto-generated method stub
    //     if(age == o.age){
    //         return 0;
    //     }
    //     else if(age>o.age){
    //         return 1;
    //     }
    //     else{
    //         return -1;
    //     }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        // if(age == o.age){
        //     return 0;

        // }
        
        // else if(age>o.age){
        //     return 1;

        // }
        // else {
        //     return -1;
        // }
        return(this.age-o.age);
    }
        
    // }
    // @Override
    // public int compareTo(Student o){
    //     return (name.compareTo(o.name));
    // }
   
   
}