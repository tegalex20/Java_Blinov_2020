package head03_option_a;

public class Patient {
	private static int id = 0;
	private int current_id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long telefon;
	private int medical_card;
	private String diagnosis;
	
	
	public Patient(String surname, String name,
			String patronymic, String address, long telefon, int medical_card,
			String diagnosis) {
		super();
		Patient.id++;
		this.current_id = Patient.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.telefon = telefon;
		this.medical_card = medical_card;
		this.diagnosis = diagnosis;
	}
	public Patient( String surname, String name,
			String patronymic, long telefon, int medical_card,
			String diagnosis) {
		super();
		Patient.id++;
		this.current_id = Patient.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = "Odessa Gaidara 40";
		this.telefon = telefon;
		this.medical_card = medical_card;
		this.diagnosis = diagnosis;
	}
	public Patient(String surname, String name,
			String patronymic, String address, long telefon, int medical_card) {
		super();
		Patient.id++;
		this.current_id = Patient.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.telefon = telefon;
		this.medical_card = medical_card;
		this.diagnosis = "ORVI";
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getTelefon() {
		return telefon;
	}
	public void setTelefon(long telefon) {
		this.telefon = telefon;
	}
	public int getMedical_card() {
		return medical_card;
	}
	public void setMedical_card(int medical_card) {
		this.medical_card = medical_card;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public static int getId() {
		return id;
	}
	public int getCurrent_id() {
		return current_id;
	}
	@Override
	public String toString() {
		return "Patient [id=" + current_id + ", surname=" + surname
				+ ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", telefon=" + telefon
				+ ", medical_card=" + medical_card + ", diagnosis=" + diagnosis
				+ "]";
	}
	
	
	
}
