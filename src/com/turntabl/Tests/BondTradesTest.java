package com.turntabl.Tests;

import com.turntabl.BondTrades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradesTest {

    @Test
    void calcDividend() {
        int expected = 12;

        var bondDividend = new BondTrades("1", "BD", 100, 2,12);
        assertEquals(expected, bondDividend.calcDividend());
    }
}