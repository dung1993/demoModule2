package Module2Demo;

import java.util.HashSet;
import java.util.Set;

public class Table {
    private int id;
    private String name;
    private double total;

    private Set<OrderItem> orderItemSet;

    public Table(){}

    public Table(int id, String name, double total, Set<OrderItem> orderItemSet) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.orderItemSet = orderItemSet;
    }

    public Table(int id, String name, double total) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.orderItemSet = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Set<OrderItem> getOrderItemSet() {
        return orderItemSet;
    }

    public void setOrderItemSet(Set<OrderItem> orderItemSet) {
        this.orderItemSet = orderItemSet;
    }
}
