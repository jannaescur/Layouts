/**
 * Created by Carles on 02/12/2016.
 */


public class Item {

    private int image;
    private String title, date_time, place;

    public Item() {
        super();
    }

    public Item(int image, String title, String date_time, String place) {
        super();
        this.image = image;
        this.title = title;
        this.date_time = date_time;
        this.place = place;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateTime() {
        return date_time;
    }

    public void setDateTime(String date_time) {
        this.date_time = date_time;
    }

    public String getPlace() {
        return date_time;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
