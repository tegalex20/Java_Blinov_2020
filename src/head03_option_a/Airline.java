package head03_option_a;

public class Airline {


    private String destination;
    private int flight_number;
    private String aircraft_type;
    private double departure_time;
    private String days_weeks;

    public Airline(String destination, int flight_number, String aircraft_type, double departure_time) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.aircraft_type = aircraft_type;
        this.departure_time = departure_time;
        this.days_weeks = "Wednesday";
    }

    public Airline(String destination, int flight_number, String aircraft_type,  String days_weeks) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.aircraft_type = aircraft_type;
        this.departure_time = 12.30;
        this.days_weeks = days_weeks;
    }

    public Airline(String destination, int flight_number, String aircraft_type, double departure_time, String days_weeks) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.aircraft_type = aircraft_type;
        this.departure_time = departure_time;
        this.days_weeks = days_weeks;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getAircraft_type() {
        return aircraft_type;
    }

    public void setAircraft_type(String aircraft_type) {
        this.aircraft_type = aircraft_type;
    }

    public double getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(double departure_time) {
        this.departure_time = departure_time;
    }

    public String getDays_weeks() {
        return days_weeks;
    }

    public void setDays_weeks(String days_weeks) {
        this.days_weeks = days_weeks;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flight_number=" + flight_number +
                ", aircraft_type='" + aircraft_type + '\'' +
                ", departure_time=" + departure_time +
                ", days_weeks='" + days_weeks + '\'' +
                '}';
    }
}
