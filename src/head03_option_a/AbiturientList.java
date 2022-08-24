package head03_option_a;

public class AbiturientList {
	
	//�������� ������� ������ �� ������.
    
    private Abiturient [] abits;

			//�����������
    	
       public AbiturientList(int n) {
				super();
				abits = new Abiturient [n];
			}

	public void generatedAbiturient() {
		    Abiturient ab1 = new Abiturient("Ivanov",  "Petr",  "Ivanivich", 80503321980l, 4, 3, 3, 5);
		    Abiturient ab2 = new Abiturient("Petrov", "Ivan", "Petrovich", 80673321980l, 4, 4, 3, 5);
		    Abiturient ab3 = new Abiturient("Berezin", "Oleg", "Petrovich",  80633661980l, 5, 3, 3, 5);
		    Abiturient ab4 = new Abiturient("Ivanko",  "Petr",  "Ivanivich",  80633441980l, 4, 3, 3, 5);
		    Abiturient ab5 = new Abiturient("Sidorov", "Oleg", "Olegovich",  80633321933l,  4, 3, 5, 5);
			
			
			abits [0] = ab1;
			abits [1] = ab2;
			abits [2] = ab3;
			abits [3] = ab4;
			abits [4] = ab5;
		}



}
