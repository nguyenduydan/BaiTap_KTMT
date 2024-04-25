package creational.builder.kt_tourdulich;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataTour {
    private static Dictionary<String, DataTour> instance = new Hashtable<>();

    List<Tour> tours = new ArrayList<>();

    private DataTour(){}

    public static DataTour getInstance(String tag){
        if(instance.get(tag) == null){
            instance.put(tag, new DataTour());
        }
        return instance.get(tag);
    }

    public void addTour (Tour tour){
        tours.add(tour);
    }

    public void printTour(){
        for(Tour i : tours){
            System.out.println(i.toString());
        }
    }

}
