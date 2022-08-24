package head03_option_a;

public class BookList {
//�������� ������� ������ �� ������.
    
    private Book [] books;

			//�����������
    
    	
       public BookList(int n) {
				super();
				books = new Book [n];
			}

	public void generatedBook() {
		    Book bk1 = new Book("Lava", "Dotr V. B.", "Zevs", 2022, 15, 130 , "soft bining");
		    Book bk2 = new Book("Java", "Blinov J. N.", "Orion", 2020, 280, 160, "soft bining");
		    Book bk3 = new Book("Lesteli", "Dotr V. B.", "Zevs", 2020, 150, 830 , "soft bining");
		    Book bk4 = new Book("C++", "Blinov J. N.", "Zevs", 2010, 280, 160, "soft bining");
		    Book bk5 = new Book("Lava", "Potr V. B.", "Zevs", 2012, 15, 130 , "soft bining");
		    Book bk6 = new Book("Java", "Romanchik J. N.", "Orion", 2010, 280, 160, "soft bining");
		  
			
			
		    books [0] = bk1;
		    books [1] = bk2;
		    books [2] = bk3;
		    books [3] = bk4;
		    books [4] = bk5;
		    books [5] = bk6;
		}



}
