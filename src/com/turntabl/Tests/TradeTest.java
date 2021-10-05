package com.turntabl.Tests;

import com.turntabl.Trade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @Test
    void testPositivePrices() {
        double expected = 2.5;
//        var newTrade = new Trade("T1", "APPL", 100);
//        newTrade.setPrice(2.5);
//        assertEquals(expected, newTrade.getPrice());
    }

    @Test
    void testNegativePrices() {
        double expected = -2.5;
//        var newTrade = new Trade("T2", "BIC", 50);


        assertThrows(IllegalArgumentException.class, () -> {
//            newTrade.setPrice(-2.5);
        });
    }
}