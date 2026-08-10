package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Order order;
    private Product product; //composição

    public OrderItem () {

    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Product: " + product + "\n" +
                "Quantity: " + quantity + "\n" +
                "Subtotal: " + "$" + String.format("%.2f", subTotal()) + "\n" +
                "-------------------------------";

    }
}
