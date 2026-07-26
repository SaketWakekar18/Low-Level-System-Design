package models;

import interfaces.Payment;

public class Card extends Payment {
    @Override
    public void pay() {
        System.out.println("Paying in Card");
    }
}
