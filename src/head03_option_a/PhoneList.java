package head03_option_a;

public class PhoneList {
//Создание массива ссылок на объект.
    
    private Phone [] subscriber;

			//конструктор
	public PhoneList(int n) {
				super();
				subscriber = new Phone[n];
			}

	public void generatedPhone() {
		Phone sub1 = new Phone("Ivanov",  "Petr",  "Ivanivich",  "Odessa Gaidara 24" , 34324532, 345, 700, 33.30, 0);
		Phone sub2 = new Phone("Sidorov", "Ivan", "Olegovich",  "Odessa Gaidara 24" , 34324460, 345, 700, 33.30, 0);
		Phone sub3 = new Phone("Ivanov",  "Oleg",  "Ivanivich",  "Odessa Gaidara 24" , 34234532, 345, 700, 33.30, 0);
		Phone sub4 = new Phone("Berezin", "Oleg", "Petrovich",  "Odessa Gaidara 24" , 34324467, 345, 700, 33.30, 0);
		Phone sub5 = new Phone("Ivanko",  "Petr",  "Ivanivich",  "Odessa Gaidara 24" , 34724532, 345, 700, 33.30, 0);
		Phone sub6 = new Phone("Perov", "Igor", "Petrovich",  "Odessa Gaidara 24" , 34324702, 345, 700, 33.30, 0);
		
			
			
		subscriber [0] = sub1;
		subscriber [1] = sub2;
		subscriber [2] = sub3;
		subscriber [3] = sub4;
		subscriber [4] = sub5;
		subscriber [5] = sub6;
		}



}
