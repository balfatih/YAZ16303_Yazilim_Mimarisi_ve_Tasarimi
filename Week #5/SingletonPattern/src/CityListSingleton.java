import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityListSingleton {

    private static CityListSingleton instance;
    Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    String timeString = dateFormat.format(now);
    private CityListSingleton() {
        ////
    }

    public static CityListSingleton getInstance(){

        if(instance == null){
            instance = new CityListSingleton();
        }
        return instance;
    }

    public List<City> getCities(){


        System.out.println("Data loading, please wait...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(timeString);

        List<City> cities =  new ArrayList<>();

        cities.add(new City("İstanbul"));
        cities.add(new City("Ankara"));
        cities.add(new City("Kırklareli"));

        return cities;
    }

}
