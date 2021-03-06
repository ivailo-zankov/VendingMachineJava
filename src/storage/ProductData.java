package storage;

/**
 * Class for products data
 */
public class ProductData {
    private String name;
    private double price;
    private int quantity;

    /**
     * Init product
     * @param name product name
     * @param price product price
     */
    public ProductData(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity =quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }

    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
}
