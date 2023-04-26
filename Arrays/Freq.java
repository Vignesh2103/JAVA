import java.util.Arrays;

public class Freq {
    
    public static void countFreq(int[] arr, int n){
        boolean visited[] = new boolean[n];
     
       Arrays.fill(visited, false);
 
    // Traverse through array elements and
    // count frequencies
    for (int i = 0; i < n; i++) {
 
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " " + count);
    }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,2,2,3,1};
        int n =arr.length;
        countFreq(arr, n);
    }

    
}
