package Module2Demo;

import java.util.Objects;

public class Product {
    private int idProduct;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int idProduct, String name, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object product) {
        Product p1 = (Product) product;
        if (this == product) {
            return true;
        } else {
            if (this.getName().equalsIgnoreCase(p1.getName()) && this.idProduct == p1.getIdProduct() && this.getPrice() == p1.getPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, name, price);
    }


}
