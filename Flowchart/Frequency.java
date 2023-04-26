import java.util.*;
public class Frequency{
    public static void countFreq(int[] l, int n){
        Boolean visited[] = new Boolean[n];
        Arrays.fill(visited, false);
        for(int i=0;i<n;i++){
            if(visited[i]== true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(l[i] == l[j]){
                    visited[j]= true;
                    count++;
                }
            }
            System.out.println(l[i]+" Occurs "+count+" times");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        for(int i=0;i<n;i++){
            list[i]= sc.nextInt();
        }
        countFreq(list, n);
    }
}