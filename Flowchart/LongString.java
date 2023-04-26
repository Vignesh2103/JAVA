import java.util.*;
public class LongString {
    public static void findLongestString(String[] l, int n){
        String max = "";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(l[j].length()>l[i].length()){
                    max=l[j];
            }
        }
    }
        System.out.println("Longest String "+max);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String l[] = new String[n];
        for(int i=0;i<n;i++){
            l[i]=sc.next();
        }
        findLongestString(l,n);
    }
    
}
