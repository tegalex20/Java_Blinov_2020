package head03_option_a;

public class Book {
	private static int id = 0;
	private int current_id;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int pages;
	private int price;
	private String binding;
	
	public Book( String title, String author, String publisher,
			int year, int pages, int price, String binding) {
		super();
		Book.id++;
		this.current_id = Book.id;
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}
	public Book( String title, String author, String publisher,
			int year, int pages, int price) {
		super();
		Book.id++;
		this.current_id = Book.id;
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = "Bond";
	}
	public Book( String title, String author,
			int year, int pages, int price, String binding) {
		super();
		Book.id++;
		this.current_id = Book.id;
		
		this.title = title;
		this.author = author;
		this.publisher = "Zevs";
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public static int getId() {
		return id;
	}
	public int getCurrent_id() {
		return current_id;
	}
	@Override
	public String toString() {
		return "Book [id=" + current_id + ", title=" + title
				+ ", author=" + author + ", publisher=" + publisher + ", year="
				+ year + ", pages=" + pages + ", price=" + price + ", binding="
				+ binding + "]";
	}
	
	
	
}
