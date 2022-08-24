package head03_option_a;

public class Customer {

	private static int id = 0;
	private int current_id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int credit_card;
	private int score_iban;
	
	// несколько конструкторов
	public Customer( String surname, String name,
			String patronymic, String address, int credit_card, int score_iban) {
		super();
		Customer.id++;
		this.current_id = Customer.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.credit_card = credit_card;
		this.score_iban = score_iban;
	}

	
	public Customer( String surname, String name,
			String patronymic, String address, int credit_card) {
		super();
		Customer.id++;
		this.current_id = Customer.id;
		
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.credit_card = credit_card;
		this.score_iban = 235738757;
	}

	

	public Customer(String surname, String name,
			String patronymic, int credit_card, int score_iban) {
		super();
		Customer.id++;
		this.current_id = Customer.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = "Odessa Gaidara 24";
		this.credit_card = credit_card;
		this.score_iban = score_iban;
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

	public int getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(int credit_card) {
		this.credit_card = credit_card;
	}

	public int getScore_iban() {
		return score_iban;
	}

	public void setScore_iban(int score_iban) {
		this.score_iban = score_iban;
	}

	public static int getId() {
		return id;
	}

	public int getCurrent_id() {
		return current_id;
	}

	@Override
	public String toString() {
		return "Customer [current_id=" + current_id + ", surname=" + surname
				+ ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", credit_card=" + credit_card
				+ ", score_iban=" + score_iban + "]";
	}
	
	
	
}
