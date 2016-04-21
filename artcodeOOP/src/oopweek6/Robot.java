package oopweek6;

public class Robot {

    private String location;
    private long id;
    private int price;

    public Robot() {
    }

    public Robot(String location, long id, int price) {
        this.location = location;
        this.id = id;
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = this.price;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "location='" + location + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
