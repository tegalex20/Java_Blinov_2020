package head03_option_a;

public class Train {
    private String destination;
    private int train_number;
    private double departure_time;
    private int seats_general;
    private int seats_coupe;
    private int seats_reserved;
    private int seats_suite;

    public Train(int train_number, double departure_time, int seats_general, int seats_coupe, int seats_reserved, int seats_suite) {
        this.destination = "Lvov";
        this.train_number = train_number;
        this.departure_time = departure_time;
        this.seats_general = seats_general;
        this.seats_coupe = seats_coupe;
        this.seats_reserved = seats_reserved;
        this.seats_suite = seats_suite;
    }

    public Train(String destination, int train_number,  int seats_general, int seats_coupe, int seats_reserved, int seats_suite) {
        this.destination = destination;
        this.train_number = train_number;
        this.departure_time = 14.30;
        this.seats_general = seats_general;
        this.seats_coupe = seats_coupe;
        this.seats_reserved = seats_reserved;
        this.seats_suite = seats_suite;
    }

    public Train(String destination, int train_number, double departure_time, int seats_general, int seats_coupe, int seats_reserved, int seats_suite) {
        this.destination = destination;
        this.train_number = train_number;
        this.departure_time = departure_time;
        this.seats_general = seats_general;
        this.seats_coupe = seats_coupe;
        this.seats_reserved = seats_reserved;
        this.seats_suite = seats_suite;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrain_number() {
        return train_number;
    }

    public void setTrain_number(int train_number) {
        this.train_number = train_number;
    }

    public double getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(double departure_time) {
        this.departure_time = departure_time;
    }

    public int getSeats_general() {
        return seats_general;
    }

    public void setSeats_general(int seats_general) {
        this.seats_general = seats_general;
    }

    public int getSeats_coupe() {
        return seats_coupe;
    }

    public void setSeats_coupe(int seats_coupe) {
        this.seats_coupe = seats_coupe;
    }

    public int getSeats_reserved() {
        return seats_reserved;
    }

    public void setSeats_reserved(int seats_reserved) {
        this.seats_reserved = seats_reserved;
    }

    public int getSeats_suite() {
        return seats_suite;
    }

    public void setSeats_suite(int seats_suite) {
        this.seats_suite = seats_suite;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", train_number=" + train_number +
                ", departure_time=" + departure_time +
                ", seats_general=" + seats_general +
                ", seats_coupe=" + seats_coupe +
                ", seats_reserved=" + seats_reserved +
                ", seats_suite=" + seats_suite +
                '}';
    }
}
