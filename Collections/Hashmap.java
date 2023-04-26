import java.util.*;

public class Hashmap{
    public static void main(String[] args) {
        String s= "Vignesh" ;
        int p = 007;

        HashMap<String, Integer> ht = new HashMap<>();
        ht.put("Vignesh", 007);
        ht.put("Vikram", 101);
        ht.put("Dhanish", 102);
        ht.put("Sushee", 010);
        ht.put("Andavar", 011);
        // for(Map.Entry m: ht.entrySet()){
        //     System.out.println(m.getKey()+":"+m.getValue());
        // }
        // System.out.println("------CRUD OPERATION--------");
        // ht.remove("Vikram");
        for(Map.Entry m : ht.entrySet()){
            if((m.getKey().equals(s)) && (m.getValue().equals(p))){
                System.out.println("yes it is valid");

            }
           

        }
    //    System.out.println(ht.toString()); 
        

        

    }

    @Override
    public String toString() {
        return "Hashmap []";
    }
}