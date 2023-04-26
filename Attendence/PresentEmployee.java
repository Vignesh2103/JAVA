import java.util.*;
public class PresentEmployee {
    public PresentEmployee(int id, String name, String location) {
        Id = id;
        Name = name;
        Location = location;
    }
    int Id;
    String Name;
    String Location;
        
    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);
       
        PresentEmployee[] present= new PresentEmployee[5]; 
        int k =5;
        TotalEmployee totalemployee[] = new TotalEmployee[k];
        totalemployee[0]= new TotalEmployee(101, "Vignesh", "chennai");
        totalemployee[1]= new TotalEmployee(102, "ViKram", "Bangolore");
        totalemployee[2]= new TotalEmployee(103,"Shamilpriya","Karamadai");
        totalemployee[3] = new TotalEmployee(104,"Vishnu Priya", "Karur");
        totalemployee[4]= new TotalEmployee(105,"Yogesh", "Coimbatore");
        
        int n = sc.nextInt();
        int[] empId = new int[n];
        for(int i=n;i>=0;i--){
            empId[i]=sc.nextInt();
        }
        Arrays.sort(empId);
        
        
    }
    public static void checkAttendence(int[] empId, PresentEmployee[] present, TotalEmployee totalemployee[], int k, int n){
     
        TotalEmployee[] total= totalemployee.clone();
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<n;i++){
                if(total[i].id == empId[j]){
                    present[index]=total[i];

                }
            }
        }

    }
}
