package head03_option_a;

public class HouseList {
//Создание массива ссылок на объект.
    
    private House [] home;

			//конструктор
    	public HouseList(int n) {
				super();
				this.home = new House [n];
			}

	public void generatedHouse() {
		    House h1 = new House( 3, 44.5, 2, "Gaidara", "brick", 40);
		    House h2 = new House(3, 55.4, 5, 2, "Nova", "brick", 40);
		    House h3 = new House( 3, 54.5, 2, "Gaidara", "concrete", 40);
		    House h4 = new House(3, 65.4, 3, 2, "Nova", "brick", 40);
		    House h5 = new House( 3, 44.5, 2, "Gaidara", "brick", 40);
		    House h6 = new House(3, 55.4, 5, 2, "Nova", "brick", 40);
			
			home [0] = h1;
			home [1] = h2;
			home [2] = h3;
			home [3] = h4;
			home [4] = h5;
			home [5] = h6;
		}



}
