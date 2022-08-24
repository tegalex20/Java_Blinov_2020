package head03_option_a;

public class TrainList {
    //Создание массива ссылок на объект.
    private Train[] trains;


    //конструктор
    public TrainList(int n) {
        this.trains = new Train[n];
    }


    public void generatedTrain() {

        Train tr1 = new Train("Lviv", 24, 20, 40, 40, 50);
        Train tr2 = new Train("Oslo", 14, 50, 40, 40, 50);
        Train tr3 = new Train("Lviv", 4, 13.30, 20, 40, 40, 50);
        Train tr4 = new Train("Ziter", 24, 80, 90, 40, 50);
        Train tr5 = new Train("Lviv", 24, 23.00, 20, 40, 40, 50);
        Train tr6 = new Train("Lviv", 24, 40, 40, 40, 50);


        trains[0] = tr1;
        trains[1] = tr2;
        trains[2] = tr3;
        trains[3] = tr4;
        trains[4] = tr5;
        trains[5] = tr6;
    }
}
