import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CityReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            // List<City> Citys = new ArrayList<>();
            City worldCity[] = new City[101];
            int n=worldCity.length;
            
           

            BufferedReader br = new BufferedReader(new FileReader("worldcities.csv"));
            String line;
            int i=0;
            while( (line = br.readLine()) != null){
            
                String s[]= line.split(",");
                City c =  new City(s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9],s[10]);
                worldCity[i]=c;
                i++;
            }
            // uniqueCities(worldCity, n);
            // totalCities(worldCity, n);
            // sameLatCity(worldCity, n);
            // sameLngCity(worldCity, n);
            // sameLatLngCity(worldCity, n);
            //sameCountryCountCity(worldCity, n);
            //searchCities(worldCity, n);
            //orderCityPopulation(worldCity);
            //lessPopulatedCity(worldCity, n);
           
            
            // for (City city : worldCity) {
            //     System.out.println(city.city);
            // }
           

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void uniqueCities(City worldCity[], int n){
        City[] copy = worldCity.clone();
        
        int count=0;
        int index=0;
        System.out.println("------------UNIQUE CITIES----------------------");
        System.out.println("THE UNIQUE CITY LIST : ");
        for(int i=0;i<n;i++){
          count=0;
          for(int j=0;j<n;j++){
            if(copy[i].city.equals(copy[j].city)&& (i != j)){
              count++;
            }

          }
          if(count == 0){
           
            System.out.println(copy[i].city);
            index++;
          }
        }


    }
    public static void totalCities(City worldCity[], int n){
        City[] copy = worldCity.clone();
        int count=0;
        for(int i=0;i<n;i++){
            if(copy[i].city != null){
                count++;
            }
        }
        System.out.println("------------TOTAL CITIES----------------------");
        System.out.println("THE TOTAL CITY COUNT : "+count);
        
    }
    public static void sameLatCity(City worldCity[],int n){
        City[] unqiue = new City[n];
        int ind=0;
        City[] copy = worldCity.clone();
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(copy[i].lat.equals(copy[j].lat)&& i != j){
                    count++;

                }
                
            }
            if(count>0){
                unqiue[ind]=copy[i];
                ind++;
            }
           
        }
            System.out.println("------------THE SAME LATITUDE CITIES-------------");
            for (City city : unqiue) {
                if(city != null){
                    System.out.println(city.city);
                }
                
            }
        }
        
            
                
    
       
        public static void sameLngCity(City worldCity[],int n){
            City[] unqiue = new City[n];
            int ind=0;
            City[] copy = worldCity.clone();
            int count=0;
            for(int i=0;i<n;i++){
                count=0;
                for(int j=0;j<n;j++){
                    if(copy[i].lng.equals(copy[j].lng)&& i != j){
                        count++;
    
                    }
                    
                }
                if(count>0){
                    unqiue[ind]=copy[i];
                    ind++;
                }
               
            }
                System.out.println("------------THE SAME LONGTITUDE CITIES-------------");
                for (City city : unqiue) {
                    if(city != null){
                        System.out.println(city.city);
                    }
                    
                }
            }
        
            public static void sameLatLngCity(City worldCity[],int n){
                City[] unqiue = new City[n];
                int ind=0;
                City[] copy = worldCity.clone();
                int count=0;
                
                for(int i=0;i<n;i++){
                    count=0;
                    for(int j=0;j<n;j++){
                        if(copy[i].lng.equals(copy[j].lng)&& copy[i].lat.equals(copy[j].lat) &&i != j){
                            count++;
        
                        }
                        
                    }
                    if(count>0){
                        unqiue[ind]=copy[i];
                        ind++;
                    }
                   
                }
                    System.out.println("------------THE SAME lAT&LONGTITUDE CITIES-------------");
                    for (City city : unqiue) {
                        if(city != null){
                            System.out.println(city.city);
                        }
                        
                    }
                }

                public static void sameCountryCountCity(City worldCity[],int n){
                    System.out.println("------------THE SAME COUNTRY CITIES COUNT-------------");
                    City[] copy = worldCity.clone();
                    int count=0;
                    Map<String, Integer> C = new HashMap<>();
                    for(int i=0;i<n;i++){
                        count=0;
                        for(int j=0;j<n;j++){
                            if(copy[i].country.equals(copy[j].country)){
                          
                                    count++;
                            }
                        }
                        if(count > 0 ){
                            C.put(copy[i].country,count);
                            //System.out.println(copy[i].country+" : "+count);
                        }
                    }
                    for( Entry<String, Integer> entry : C.entrySet() ){
                        System.out.println( entry.getKey() + " = " + entry.getValue() );
                    }
                    

                    
                }
                        
                        
            
                    public static void searchCities(City worldCity[],int n){
                        Scanner sc = new Scanner(System.in);
                        String s = sc.next();
                        City[] copy = worldCity.clone();
                        
                        //System.out.println(copy[n-1].city);
                        for(int i=0;i<n;i++){
                            if(s.equalsIgnoreCase(copy[i].city)){
                                System.out.println(copy[i].toString());
                            }  
                        }
                            
                           
                        }
                           
             
                public static void orderCityPopulation(City[] worldCity){
                    City[] copy = worldCity.clone();
                    Arrays.sort(copy);
                    for (City city : copy) {
                        System.out.println(city.toString());
                        
                    }

                }
                
    

    
}
