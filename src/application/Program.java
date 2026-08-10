package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {

    void main() {

        Client client;
        Order order;
        Product product;
        OrderItem orderitem;

        IO.println("Enter client data:");
        IO.print("Name: ");
        String clientName = IO.readln();
        IO.print("Email: ");
        String clientEmail = IO.readln();
        IO.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(IO.readln(), Client.FORMATTER);

        IO.println("Enter order data: ");
        IO.print("Status: ");
        String orderStatus = IO.readln();

        client = new Client(clientName, clientEmail, birthDate);
        order = new Order(OrderStatus.valueOf(orderStatus), client);

        IO.print("How many items to this order? ");
        int n = Integer.parseInt(IO.readln());

        for (int i = 0; i<n; i++){
            IO.println("Enter #" + (i+1) + " item data:");
            IO.print("Product name: ");
            String productName = IO.readln();
            IO.print("Price: ");
            double productPrice = Double.parseDouble(IO.readln());
            IO.print("Quantity: ");
            int productQuantity = Integer.parseInt(IO.readln());

            product = new Product(productPrice, productName);
            orderitem = new OrderItem(order, product, productQuantity, productPrice);
            order.addItem(orderitem);

        }

        IO.println(order);

    }

}
