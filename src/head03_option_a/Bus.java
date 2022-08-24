package head03_option_a;

public class Bus {
    private String surname;
    private String initials;
    private int number_bus;
    private int route_number;
    private String mark;
    private int year;
    private int mileage;

    public Bus( String initials, int number_bus, int route_number, String mark, int year, int mileage) {
        this.surname = "Ivanov";
        this.initials = initials;
        this.number_bus = number_bus;
        this.route_number = route_number;
        this.mark = mark;
        this.year = year;
        this.mileage = mileage;
    }

    public Bus(String surname, String initials, int number_bus, int route_number, int year, int mileage) {
        this.surname = surname;
        this.initials = initials;
        this.number_bus = number_bus;
        this.route_number = route_number;
        this.mark = "Bogdan";
        this.year = year;
        this.mileage = mileage;
    }

    public Bus(String surname, String initials, int number_bus, int route_number, String mark, int year, int mileage) {
        this.surname = surname;
        this.initials = initials;
        this.number_bus = number_bus;
        this.route_number = route_number;
        this.mark = mark;
        this.year = year;
        this.mileage = mileage;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getNumber_bus() {
        return number_bus;
    }

    public void setNumber_bus(int number_bus) {
        this.number_bus = number_bus;
    }

    public int getRoute_number() {
        return route_number;
    }

    public void setRoute_number(int route_number) {
        this.route_number = route_number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", number_bus=" + number_bus +
                ", route_number=" + route_number +
                ", mark='" + mark + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
