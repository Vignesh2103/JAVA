import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class PersonTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            List<Person> persons = Arrays.asList(new Person("Vignesh",21),new Person("Vikram",22),new Person("Dani",30),new Person("Susee",35),new Person("Vignesh",21));
            // System.out.println("---------Print Array-----------");
            // persons.forEach(System.out::println);
            // System.out.println("---------Find ends with letter-----------");
            // persons.stream().filter(i ->i.getName().endsWith("h")).collect(Collectors.toList()).forEach(System.out::println);;
            // System.out.println("---------Maximum Value in arrray-----------");
            // persons.stream().max(Comparator.comparing(Person::getAge)).ifPresent(s -> System.out.println(s));
            // System.out.println("---------Find ends with Suffix-----------");
            // persons.stream().filter(s -> s.getName().endsWith("m")).forEach(System.out::println);
            // System.out.println("---------Sorted the Array-----------");
            // persons.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
            // System.out.println("------------Distinct--------------");
            // persons.stream().map(Person::getName).distinct().collect(Collectors.toList()).forEach(System.out::println);
            // System.out.println("---------SKIP-----------");
            // persons.stream().skip(2).forEach(System.out::println);
            System.out.println("---------Reduce-----------");
            String[] myArray = { "this", "is", "a", "sentence"};
            String Res = Arrays.stream(myArray).reduce("",(a,b)-> a+b);
            System.out.println(Res);

       
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
    
}
