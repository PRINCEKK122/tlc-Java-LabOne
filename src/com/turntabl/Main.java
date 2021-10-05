package com.turntabl;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var newFund = new FundTrades("1", "EPL", 3, 33.99, 5);
        System.out.println(newFund.calcDividend());
    }
}
