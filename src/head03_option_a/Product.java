package head03_option_a;

public class Product {

    private static int id = 0;
    private int current_id;
    private String name;
    private String upc;
    private String manufacturer;
    private int price;
    private int shelf_life_month;
    private int amount;

    public Product(String name, String upc, String manufacturer, int price, int shelf_life_month, int amount) {
        Product.id++;
        this.current_id = Product.id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelf_life_month = shelf_life_month;
        this.amount = amount;
    }

    public Product(String upc, String manufacturer, int price, int shelf_life_month, int amount) {
        Product.id++;
        this.current_id = Product.id;
        this.name = "Milk";
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelf_life_month = shelf_life_month;
        this.amount = amount;
    }

    public Product() {

    }

    public static int getId() {
        return id;
    }



    public int getCurrent_id() {
        return current_id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShelf_life_month() {
        return shelf_life_month;
    }

    public void setShelf_life_month(int shelf_life_month) {
        this.shelf_life_month = shelf_life_month;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + current_id +
                ", name='" + name + '\'' +
                ", upc='" + upc + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shelf_life_month=" + shelf_life_month +
                ", amount=" + amount +
                '}';
    }
}
