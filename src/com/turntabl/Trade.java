package com.turntabl;

public abstract class Trade {
    private final String id;
    private final String symbol;
    private final int quantity;
    private double price;

    // constructors
    public Trade(String id, String symbol, int quantity, double price) {
        this(id, symbol, quantity);
        this.setPrice(price);
    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    // Getters and setters
    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            return;
        }

        throw new IllegalArgumentException("Price cannot be negative");
    }

    abstract double calcDividend();

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
