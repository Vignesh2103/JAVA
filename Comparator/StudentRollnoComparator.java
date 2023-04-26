import java.util.Comparator;

public class StudentRollnoComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        if(o1.rollno == o2.rollno){
            return 0;
        }
        else if(o1.rollno > o2.rollno){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
