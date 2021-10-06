package com.turntabl;

public class Bronze extends MembershipType {
    private final byte minPoints;
    private final byte maxPoints;
    private final byte tradeLimitsPerDay;

    public Bronze() {
        minPoints = 1;
        maxPoints = 9;
        tradeLimitsPerDay = 5;
    }

    public byte getMinPoints() {
        return minPoints;
    }

    public byte getMaxPoints() {
        return maxPoints;
    }

    @Override
    public String getMembershipType() {
        return "Bronze";
    }

    @Override
    public int getTradeLimit() {
        return tradeLimitsPerDay;
    }
}
