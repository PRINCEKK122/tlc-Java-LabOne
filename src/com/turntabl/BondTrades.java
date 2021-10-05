package com.turntabl;

public class BondTrades extends Trade {
    private final double dividend;

    public BondTrades(String id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.dividend = dividend;
    }

    @Override
    public double calcDividend() {
        return this.dividend;
    }
}
