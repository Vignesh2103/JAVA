import java.util.*;
public class Jagge {
    public static void main(String[] args) {
        @SuppressWarnings("Unchecked")
        Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
       
        // int[][] jag = new int[n][];
        // jag[0]=new int[]{};
        // jag[1]= new int[] {};
        // jag[2]= new int[]{};
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<jag[i].length;j++){
        //         jag[i][j]= sc.nextInt();
        //     }
        // }
        // for(int[] i :jag){
        //     // System.out.println();
        //     System.out.println(Arrays.toString(i));

        // }
        //System.out.println(Arrays.toString(jag[0]));
        Toy toy11 = new Toy(101, "DC" ,"Bateman",200,"XL" ,"Black","cotton",10,"california","December");
        
        System.out.println( toy11.toString()); 
       

        
    }

    @Override
    public String toString() {
        return "Jagge []";
    }
    
}
