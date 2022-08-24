package head03_option_a;

public class Abiturient {
	private static int id = 0;
	private int current_id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long telefon;
	private int score1;
	private int score2;
	private int score3;
	private int score4;
	
	public Abiturient( String surname, String name,
			String patronymic, String address, long telefon, int score1,
			int score2, int score3, int score4) {
		super();
		Abiturient.id++;
		this.current_id = Abiturient.id;
		
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.telefon = telefon;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
	}
	
	
	public Abiturient(String surname, String name,
			String patronymic,  long telefon, int score1,
			int score2, int score3, int score4) {
		super();
		Abiturient.id++;
		this.current_id = Abiturient.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = "Odessa Gaidara 40";
		this.telefon = telefon;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
	}


	public Abiturient(String surname, String name,
			String patronymic, String address,  int score1,
			int score2, int score3, int score4) {
		super();
		Abiturient.id++;
		this.current_id = Abiturient.id;
		
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.telefon = 80675675544l;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
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


	public int getScore1() {
		return score1;
	}


	public void setScore1(int score1) {
		this.score1 = score1;
	}


	public int getScore2() {
		return score2;
	}


	public void setScore2(int score2) {
		this.score2 = score2;
	}


	public int getScore3() {
		return score3;
	}


	public void setScore3(int score3) {
		this.score3 = score3;
	}


	public int getScore4() {
		return score4;
	}


	public void setScore4(int score4) {
		this.score4 = score4;
	}


	public static int getId() {
		return id;
	}


	public int getCurrent_id() {
		return current_id;
	}


	@Override
	public String toString() {
		return "Abiturient [id=" + current_id + ", surname=" + surname
				+ ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", telefon=" + telefon + ", score1="
				+ score1 + ", score2=" + score2 + ", score3=" + score3
				+ ", score4=" + score4 + "]";
	}
	
	
	
	
	
	
	
	
	
}
