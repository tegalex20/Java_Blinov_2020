package head03_option_a;

public class AirlineList {
    //Создание массива ссылок на объект.
    private Airline[] airlines;

    //конструктор


    public AirlineList(int n) {
        this.airlines = new  Airline[n];
    }




    public void generatedAirline() {

        Airline air1 = new Airline("Lviv", 124, "TU", "Thursday");
        Airline air2 = new Airline("Oslv", 134, "TU", "Thursday");
        Airline air3 = new Airline("Gerka", 824, "TU", "Thursday");
        Airline air4 = new Airline("Lviv", 135, "TU", "Friday");
        Airline air5 = new Airline("Lviv", 164, "TU", "Wednesday");
        Airline air6 = new Airline("Lviv", 324, "TU", "Friday");

        airlines[0] = air1;
        airlines[1] = air2;
        airlines[2] = air3;
        airlines[3] = air4;
        airlines[4] = air5;
        airlines[5] = air6;
    }
}
