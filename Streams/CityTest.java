import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CityTest {
    static List<City> cities = new ArrayList<>();

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("worldcities.csv"));
            String line;
                        while((line = br.readLine()) != null){
                String s[]= line.split(",");
                clean(s);

            }
            //cities.forEach(System.out::println);
            //printUniqueCities(cities);
            printCitiesCount(cities);
           cities.stream().map(City::getCountry).com
        } catch (Exception e) {
            e.printStackTrace();
              // TODO: handle exception
        }
    }
    public static void clean(String[] s){
        String city,city_ascii,country,iso2,iso3,admin_name,capital;
        Double lat,lng;
        Long  population,id;
        city=s[0];
        city_ascii=s[1];
        lat=Double.parseDouble(s[2]);
        lng=Double.parseDouble(s[3]);
        country=s[4];
        iso2=s[5];
        iso3=s[6];
        admin_name=s[7];
        capital=s[8];
        population=Long.parseLong(s[9]);
        id=Long.parseLong(s[10]);
        City c = new City(city, city_ascii, lat, lng, country, iso2, iso3, admin_name, capital, population, id);
        cities.add(c);


   }
   public static void printUniqueCities(List<City> cities){
    cities.stream().map(City::getCity).distinct().collect(Collectors.toList()).forEach(System.out::println);

   }
   public static void printCitiesCount(List<City> cities){
    Long n=cities.stream().map(City::getCity).count();
    System.out.println(n);
   }
   
}
