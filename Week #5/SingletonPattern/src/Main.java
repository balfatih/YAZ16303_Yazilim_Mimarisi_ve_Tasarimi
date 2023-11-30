import javax.sound.midi.SysexMessage;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*
        CityList cityList = new CityList();
        List<City> cities = cityList.getCities();

        for(City city: cities){
            System.out.println(city.getCityName());
        }

        CityList cityList2 = new CityList();
        List<City> cities2 = cityList2.getCities();

        for(City city: cities2){
            System.out.println(city.getCityName());
        }

        CityList cityList3 = new CityList();
        List<City> cities3 = cityList3.getCities();

        for(City city: cities3){
            System.out.println(city.getCityName());
        }
*/
        CityListSingleton singleton = CityListSingleton.getInstance();
        List<City> cities = singleton.getCities();
        for (City city: cities){
            System.out.println(city.getCityName());
        }

        CityListSingleton singleton2 = CityListSingleton.getInstance();
        List<City> cities2 = singleton2.getCities();
        for (City city: cities2){
            System.out.println(city.getCityName());
        }

        CityListSingleton singleton3 = CityListSingleton.getInstance();
        List<City> cities3 = singleton3.getCities();
        for (City city: cities3){
            System.out.println(city.getCityName());
        }
    }

}