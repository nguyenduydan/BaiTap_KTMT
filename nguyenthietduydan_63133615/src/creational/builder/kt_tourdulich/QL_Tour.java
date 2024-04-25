package creational.builder.kt_tourdulich;

public class QL_Tour {
    String tag;

    public QL_Tour(String tag) {
        this.tag = tag;
    }

    public void add(Tour tour){
        DataTour.getInstance(tag).addTour(tour);
    }

    public void display(){
        DataTour.getInstance(tag).printTour();
    }
}
