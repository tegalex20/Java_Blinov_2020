package head03_option_a;

public class Phone {
	private static int id = 0;
	private int current_id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int credit_card;
	private int debit;
	private int credit;
	private double talk_time;
	private double intern_talk_time;
	
	public Phone(String surname, String name,
			String patronymic, String address, int credit_card, int debit,
			int credit, double talk_time, double intern_talk_time) {
		super();
		Phone.id++;
		this.current_id = Phone.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.credit_card = credit_card;
		this.debit = debit;
		this.credit = credit;
		this.talk_time = talk_time;
		this.intern_talk_time = intern_talk_time;
	}
	public Phone( String surname, String name,
			String patronymic, String address, int credit_card,
			int credit, double talk_time, double intern_talk_time) {
		super();
		Phone.id++;
		this.current_id = Phone.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.credit_card = credit_card;
		this.debit = 689;
		this.credit = credit;
		this.talk_time = talk_time;
		this.intern_talk_time = intern_talk_time;
	}
	public Phone( String surname, String name,
			String patronymic, String address, int credit_card, int debit,
			int credit, double talk_time) {
		super();
		Phone.id++;
		this.current_id = Phone.id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.credit_card = credit_card;
		this.debit = debit;
		this.credit = credit;
		this.talk_time = talk_time;
		this.intern_talk_time = 0;
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
	public int getDebit() {
		return debit;
	}
	public void setDebit(int debit) {
		this.debit = debit;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public double getTalk_time() {
		return talk_time;
	}
	public void setTalk_time(double talk_time) {
		this.talk_time = talk_time;
	}
	public double getIntern_talk_time() {
		return intern_talk_time;
	}
	public void setIntern_talk_time(double intern_talk_time) {
		this.intern_talk_time = intern_talk_time;
	}
	public static int getId() {
		return id;
	}
	public int getCurrent_id() {
		return current_id;
	}
	@Override
	public String toString() {
		return "Phone [id=" + current_id + ", surname=" + surname
				+ ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", credit_card=" + credit_card
				+ ", debit=" + debit + ", credit=" + credit + ", talk_time="
				+ talk_time + ", intern_talk_time=" + intern_talk_time + "]";
	}
	
	
	
	
	
	
	
}
