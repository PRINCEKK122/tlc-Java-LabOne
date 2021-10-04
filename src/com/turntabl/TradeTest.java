package com.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    @Test
    void testPositivePrice() {
        Trade t1 = new Trade("T1", "APPL", 100);
        t1.setPrice(15.25);
        assertEquals(15.25, t1.getPrice());
    }

    @Test
    void testNegativePrice() {
        Trade t1 = new Trade("T1", "APPL", 100);

        assertThrows(IllegalArgumentException.class, () -> t1.setPrice(-2.0));
    }
}