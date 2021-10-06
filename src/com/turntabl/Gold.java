package com.turntabl;

public class Gold extends MembershipType {
    private final short minPoints;
    private final byte tradeLimitsPerDay;

    public Gold() {
        minPoints = 20;
        tradeLimitsPerDay = 20;
    }

    public short getMinPoints() {
        return minPoints;
    }

    @Override
    public String getMembershipType() {
        return "Gold";
    }

    @Override
    public int getTradeLimit() {
        return tradeLimitsPerDay;
    }
}
