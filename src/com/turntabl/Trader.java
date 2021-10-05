package com.turntabl;

public class Trader {
    private String name;
    private final Account newAccount;

    public Trader(String name) {
        this.name = name;
        this.newAccount = new Account();
    }

    public double addTrade(Trade newTrade) {
        double newVal = newTrade.getPrice() * newTrade.getQuantity();
        newAccount.setTotalVal(newVal);
        return newVal;
    }
}
