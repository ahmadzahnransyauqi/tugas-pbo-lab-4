package edu.ecommerce;

public class main{
    public static void main(String[] args) {

        Order order = new Order("ORD01", "Ahmad");

        Order.OrderItem[] items = {
                order.new OrderItem("Laptop", 5000000, 1),
                order.new OrderItem("Mouse", 100000, 2),
                order.new OrderItem("Keyboard", 300000, 1)
        };

        order.hitungTotal(items);
        order.tampilkanRincian(items);
    }
}