package head03_option_a;

public class Car {

    private static int id = 0;
    private int current_id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String registration_number;

    public Car(String brand, String model, int year, String color, int price, String registration_number) {
        Car.id++;
        this.current_id = Car.id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registration_number = registration_number;

    }

    public Car() {
        Car.id++;
        this.current_id = Car.id;
    }

    public Car(String brand, String model, String color, int price, String registration_number) {
        Car.id++;
        this.current_id = Car.id;
        this.brand = brand;
        this.model = model;
        this.year = 1980;
        this.color = color;
        this.price = price;
        this.registration_number = registration_number;
    }

    public static int getId() {
        return id;
    }

    public int getCurrent_id() {
        return current_id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + current_id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registration_number=" + registration_number +
                '}';
    }
}
