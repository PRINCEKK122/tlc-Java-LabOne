package com.turntabl;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType;
    private short points;
    private short maxTradeValue;
    private List<Trade> clientTrades;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxTradeValue = 10_000;
        clientTrades = new ArrayList<>();
        this.points = 0;
    }

    private short checkClientPoints() {
        var points = this.points;

        if (points == 0) {
            return points;
        }

        if (points >= 1 && points <= 9) {
            membershipType = new Bronze();
        }
        else if (points >= 10 && points <= 19) {
            membershipType = new Silver();
        }
        else {
            membershipType = new Gold();
        }

        return points;
    }

    public boolean canTrade() {
        var clientPoints = this.checkClientPoints();

        if (clientPoints == 0) return false;

        if (this.membershipType.getMembershipType().equals("Bronze")
                && LocalTime.now().isBefore(LocalTime.of(10, 0))
        ) {
            return false;
        }

        return clientTrades.size() <= this.membershipType.getTradeLimit();
    }

}
