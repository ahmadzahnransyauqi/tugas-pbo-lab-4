package edu.ecommerce;

public class Order {
    private String orderId;
    private String customerName;
    private double total;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public class OrderItem {
        String productName;
        double price;
        int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }
    }

    public double hitungTotal(OrderItem[] items) {
        total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);

        for (OrderItem item : items) {
            System.out.println(item.productName + " - " + item.getSubtotal());
        }

        System.out.println("Total: " + total);
    }
}