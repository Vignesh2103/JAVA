import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        // if(o1.age == o2.age){
        //     return 0;

        // }
        
        // else if(o1.age>o2.age){
        //     return 1;

        // }
        // else {
        //     return -1;
        // }
        return (o1.age-o2.age);
    }
    
}
