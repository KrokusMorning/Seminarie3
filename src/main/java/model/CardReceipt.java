package main.java.model;

import se.kth.iv1350.payauth.CreditCard;

/**
 * Created by ocean on 2017-04-28.
 */
public class CardReceipt {
    private final int cost;
    private final int payedAmount;
    private CreditCard creditCard;

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public int getCost() {
        return cost;
    }

    public int getPayedAmount() {
        return payedAmount;
    }

    public CardReceipt(CreditCard creditCard, int cost, int payedAmount) {
        this.cost = cost;
        this.payedAmount = payedAmount;
        this.creditCard = creditCard;
    }
}
