package com.turntabl;

public class Account {
    private static double totalVal;

    public double getTotalVal() {
        return totalVal;
    }

    public void setTotalVal(double total) {
        this.totalVal += total;
    }
}
