package com.turntabl;

import java.time.*;


public abstract class Trade {
    private final String id;
    private final String symbol;
    private final int quantity;
    private double price;
    private final LocalDate date;
    private final LocalTime time;

    // constructors
    public Trade(String id, String symbol, int quantity, double price) {
        this(id, symbol, quantity);
        this.validatePrice(price);
    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    // Getters and setters
    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return price;
    }

    public void validatePrice(double price) {
        if (price > 0) {
            this.price = price;
            return;
        }

        throw new IllegalArgumentException("Prices must be greater than 0");
    }

    abstract double calcDividend();

    void addTrade(Trade trade) {
        System.out.println("Trading...");
    }


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
