package models;

import interfaces.Account;

public class Agent extends Account {

    public boolean processTicket() {
        return true;
    }

    @Override
    public void resetPassword() {
        System.out.println("Reseting Password for Agent");
    }
}
