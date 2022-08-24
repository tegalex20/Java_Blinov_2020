package head03_option_a;

public class CarList {
// todo first on IJ,

    //Создание массива ссылок на объект.
    private Car [] car;


    //конструктор
    public CarList( int n) {
        car = new  Car [n];
    }


    public void generatedCar() {
        Car cr1 = new Car ("Man", "Artea", 1999, "Green", 25456, "AT545I");
        Car cr2 = new Car("Volvo", "123", 2015, "White", 654215,"BH265I");
        Car cr3 = new Car ("Man", "Fagrtea", 2018, "Green", 254856, "AT545I");
        Car cr4 = new Car("Volvo", "123", 2015, "White", 654215,"BH265I");
        Car cr5 = new Car ("Man", "Artea", 2017, "Black", 725456, "AT545I");
        Car cr6 = new Car("Scania", "123", 2015, "White", 9654215,"BH265I");


        car [0] = cr1;
        car [1] = cr2;
        car [2] = cr3;
        car [3] = cr4;
        car [4] = cr5;
        car [5] = cr6;
    }
}
