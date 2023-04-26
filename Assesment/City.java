public class City implements Comparable<City> {
    public City(String city, String city_ascii,  String lat, String lng, String country, String iso2, String iSO3,
            String admin_name, String capital, String population , String id) {
        this.city = city;
        this.city_ascii = city_ascii;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
        this.iso2 = iso2;
        this.iSO3 = iSO3;
        this.admin_name = admin_name;
        this.capital = capital;
        this.population = population;
        this.id = id;
    }
    @Override
    public String toString() {
        return "city=" + city + ", city_ascii=" + city_ascii + ", lat=" + lat + ", lng=" + lng + ", country="
                + country + ", iso2=" + iso2 + ", iSO3=" + iSO3 + ", admin_name=" + admin_name + ", capital=" + capital
                + ", population=" + population + ", id=" + id ;
    }
    
    String city;
    String city_ascii;
    String lat;
    String lng;
    String country;
    String iso2 ;
    String iSO3;
    String admin_name;
    String capital;
    String population;
    String id;
    @Override
    public int compareTo(City o) {
        // TODO Auto-generated method stub
        return (this.population.compareTo(o.population));
    }
}
