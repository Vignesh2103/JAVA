import java.util.*;

public class StudentTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student students[] = new Student[n];
        
        //  students[0] = new Student(102, 21, "Vignesh");
        //  students[1]=new Student(103, 22, "Vikram");
        //  students[2]=new Student(101, 23, "Yogesh");
        for(int i=0;i<n;i++){
            students[i] = new Student(sc.nextInt(),sc.nextInt(),sc.next());
        }
        
       Arrays.sort(students);
       for (Student student : students) {
          System.out.println(student);
        
       }
    //    Arrays.sort(students);
    //    System.out.println(Arrays.toString(students));
    //    System.out.println();
    //    Arrays.sort(students, new StudentNameComparator());
    //    for (Student student : students) {
    //     System.out.println(student);
        
    //    }
    //    System.out.println();
    //    Arrays.sort(students, new StudentRollnoComparator());
    //    for (Student student : students) {
    //     System.out.println(student);
        
    //    }

    }

   
}
