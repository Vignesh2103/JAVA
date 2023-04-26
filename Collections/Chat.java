import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("jira",Arrays.asList("jira login", "jira","jira"));
        map.put("Salary",Arrays.asList("account", "Salary account","number"));
        map.put("Talentx Profile",Arrays.asList("name change","talentx"));

        System.out.println("Enter Your Search item");
        String s = sc .nextLine();
        s=s.replaceAll("\\s", "");
       s= s.toLowerCase();
       System.out.println(s);
      
    for(Map.Entry<String, List<String>> m : map.entrySet()){
      
       
       if(m.getValue().toString().contains(s)){
        System.out.println("You requested search item : "+m.getKey());
    }

    }
    if(s.contains("Account")){
        System.out.println("True");
    }
    else{
        System.out.println("false");
    }
    
    }
}
    

   
