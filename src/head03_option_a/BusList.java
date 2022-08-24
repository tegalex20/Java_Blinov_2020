package head03_option_a;

public class BusList {
    //Создание массива ссылок на объект.
    private Bus[] buses;



    //конструктор

    public BusList(int n) {
        this.buses = new Bus[n];
    }



    public void generatedBus() {
        Bus   bs1 = new Bus("Ivanov","N. M.", 2432, 12, 1989, 125454  );
        Bus   bs2 = new Bus("Petrov","N. M.", 3432, 13, 1989, 175454  );
        Bus   bs3 = new Bus("Ivanov","M. M.", 2832, 14, 1999, 185454  );
        Bus   bs4 = new Bus("Ivanov","L. M.", 7432, 17, 1989, 128454  );
        Bus   bs5 = new Bus("Sidorov","N. M.", 6432, 18, 1997, 175754  );
        Bus   bs6 = new Bus("Ivanov","A. M.", 2492, 15, 1989, 122454  );


        buses[0] = bs1;
        buses[1] = bs2;
        buses[2] = bs3;
        buses[3] = bs4;
        buses[4] = bs5;
        buses[5] = bs6;
    }

}
