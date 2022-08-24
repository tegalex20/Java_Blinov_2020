package head03_option_a;

public class ProductList {
    private Product[] products;

    //конструктор
    public ProductList(int n) {
        products = new Product[n];
    }


    public void generatedProduct() {
        Product prod1 = new Product("Milk","2%", "OLKZ", 44, 1,50);
        Product prod2 = new Product("Milk","1%", "OLKZ", 34, 1,20);
        Product prod3 = new Product("Milk","3%", "OLKZ", 54, 2,40);
        Product prod4 = new Product("Sour cream","2%", "OLKZ", 54, 3,50);
        Product prod5 = new Product("Sour cream","1%", "OLKZ", 64, 4,50);
        Product prod6 = new Product("Sour cream","3%", "OLKZ", 44, 1,50);



        products [0] = prod1;
        products [1] = prod2;
        products [2] = prod3;
        products [3] = prod4;
        products [4] = prod5;
        products [5] = prod6;
    }
}
