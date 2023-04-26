import java.util.*;
import java.util.function.Consumer;
import java.lang.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        // Iterator<Integer> i = l.iterator();
        
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
        
    //     ListIterator<Integer> j = l.listIterator();
    //     j.next();
    //     j.set(2000);
      
    //     while(j.hasNext()){
    //         System.out.println(j.next());

    //     }
    //     j.remove();

    //    System.out.println("Previous Value");
       
    //     while(j.hasPrevious()){
    //         System.out.println(j.previous());

    //     }
    //     System.out.println("The list value");
    //     for (Integer integer : l) {
    //         System.out.println(integer);
            
    //     }
    //     for(Integer i:l){
    //         System.out.println(i);
    //     }
        l.forEach(i->
        System.out.println("The value "+i));

        l.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }

        });

        l.forEach(System.out::println);



    }
}