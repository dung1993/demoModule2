package Module2Demo;

public class OrderItem {
    private int idOrderItem;
    private Product product;
    private int amount;

    public OrderItem(){}

    public OrderItem(int idOrderItem, Product product, int amount) {
        this.idOrderItem = idOrderItem;
        this.product = product;
        this.amount = amount;
    }

    public int getIdOrderItem() {
        return idOrderItem;
    }

    public void setIdOrderItem(int idOrderItem) {
        this.idOrderItem = idOrderItem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
