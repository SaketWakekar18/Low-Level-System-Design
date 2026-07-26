package models;

import interfaces.Payment;

public class Cash extends Payment {
    @Override
    public void pay() {
        System.out.println("Paying in cash");
    }
}
