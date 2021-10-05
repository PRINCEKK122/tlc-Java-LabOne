package com.turntabl.Tests;

import com.turntabl.Account;
import com.turntabl.Trade;
import com.turntabl.Trader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    @Test
    void testAddTrade() {
        int quantity = 3;
        double price = 1499.99;
        double expected = quantity * price;

        var trader1 = new Trader("Trader 1");
//        var trade = new Trade("T2", "BIC", 3, 1499.99);

//        assertEquals(expected, trader1.addTrade(trade));
    }
}