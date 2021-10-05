package com.turntabl;

public class FundTrades extends Trade {
    private double percentage;
    private double dividend;

    public FundTrades(String id, String symbol, int quantity, double price, int percentage) {
        super(id, symbol, quantity, price);
        this.setPercentage(percentage);
    }

    private void setPercentage(int percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Please percentage should be between the range of 1 - 100");
        }

        this.percentage = percentage / 100;
    }

    @Override
    public double calcDividend() {
        this.dividend = this.percentage * super.getPrice();
        return this.dividend;
    }
}
