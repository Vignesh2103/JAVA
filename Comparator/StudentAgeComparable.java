public class StudentAgeComparable implements Comparable<Student>{

    private int age;

    @Override
    public int compareTo(Student o) {
        if(age == o.age){
                return 0;
    
            }
            
            else if(age>o.age){
                return 1;
    
            }
            else {
                return -1;
            }
    }
    
}
