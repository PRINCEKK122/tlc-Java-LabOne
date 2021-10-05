package com.turntabl.Tests;

import com.turntabl.FundTrades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradesTest {

    @Test
    void calcDividend() {
        var newFund = new FundTrades("1", "EPL", 3, 33.99, 5);
        double percentage = 5;
        double expected = ((double)percentage / 100) * 33.99;
        assertEquals(expected, newFund.calcDividend());
    }
}