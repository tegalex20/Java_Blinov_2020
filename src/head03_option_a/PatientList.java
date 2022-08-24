package head03_option_a;

public class PatientList {
	//Создание массива ссылок на объект.
      private Patient [] ills;

			//конструктор	
		public PatientList(int n) {
			super();
			this.ills = new Patient [Patient.getId()];
		}

         public void generatedPatient() {
			Patient ill1 = new Patient( "Petrov", "Ivan", "Petrovich", 80673321980l, 235, "ORVI");
			Patient ill2 = new Patient("Ivanov",  "Petr",  "Ivanivich", "Odessa Gaidara 24", 80503321980l, 240);
			Patient ill3 = new Patient("Berezin", "Oleg", "Petrovich", "Odessa Gaidara 24", 80633661980l, 250, "ORZ");
			Patient ill4 = new Patient("Ivanko",  "Petr",  "Ivanivich", "Odessa Gaidara 24", 80633441980l, 260, "ORZ");
			Patient ill5 = new Patient("Sidorov", "Oleg", "Olegovich", "Odessa Gaidara 24", 80633321933l, 270, "ORZ");
			
			ills [0] = ill1;
			ills [1] = ill2;
			ills [2] = ill3;
			ills [3] = ill4;
			ills [4] = ill5;
		}


}
