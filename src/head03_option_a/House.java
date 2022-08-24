package head03_option_a;

public class House {
	private static int id = 0;
	private int current_id;
	private int apartment;
	private double square;
	private int floor;
	private int rooms;
	private String street;
	private String type;
	private int service;
	
	public House(int apartment, double square, int floor,
			int rooms, String street, String type, int service) {
		super();
		House.id++;
		this.current_id = House.id;
		
		this.apartment = apartment;		
		this.square = square;
		this.floor = floor;
		this.rooms = rooms;
		this.street = street;
		this.type = type;
		this.service = service;
	}
	public House(int apartment, double square, int floor,
			int rooms, String type, int service) {
		super();
		House.id++;
		this.current_id = House.id;
		this.apartment = apartment;
		this.square = square;
		this.floor = floor;
		this.rooms = rooms;
		this.street = "Gaidara";
		this.type = type;
		this.service = service;
	}
	public House(int apartment, double square,
			int rooms, String street, String type, int service) {
		super();
		House.id++;
		this.current_id = House.id;
		this.apartment = apartment;
		this.square = square;
		this.floor = 4;
		this.rooms = rooms;
		this.street = street;
		this.type = type;
		this.service = service;
		
		
	}
	public int getApartment() {
		return apartment;
	}
	public void setApartment(int apartment) {
		this.apartment = apartment;
	}

	public double getSquare() {
		return square;
	}
	
	
	public void setSquare(double square) {
		this.square = square;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	public static int getId() {
		return id;
	}
	public int getCurrent_id() {
		return current_id;
	}
	@Override
	public String toString() {
		return "House [id=" + current_id + ", apartment=" + apartment
				+ ", square=" + square + ", floor=" + floor + ", rooms="
				+ rooms + ", street=" + street + ", type=" + type
				+ ", service=" + service + "]";
	}
	
	
}
