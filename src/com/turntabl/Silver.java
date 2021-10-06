package com.turntabl;

public class Silver extends MembershipType {
    private final byte minPoints;
    private final byte maxPoints;
    private final byte tradeLimitsPerDay;

    public Silver() {
        minPoints = 10;
        maxPoints = 19;
        tradeLimitsPerDay = 10;
    }

    public byte getMinPoints() {
        return minPoints;
    }

    public byte getMaxPoints() {
        return maxPoints;
    }

    @Override
    public String getMembershipType() {
        return "Silver";
    }

    @Override
    public int getTradeLimit() {
        return tradeLimitsPerDay;
    }
}
