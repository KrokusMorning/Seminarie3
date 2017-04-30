package main.java.model;

import se.kth.iv1350.payauth.CreditCard;

/**
 * Class representing a receipt from a credit card payment.
 */
public class CardReceipt {
    private final int cost;
    private final int payedAmount;
    private CreditCard creditCard;

    /**
     *
     * @return The credit card used for the payment.
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     *
     * @return Cost for purchase.
     */
    public int getCost() {
        return cost;
    }

    /**
     *
     * @return Amount payed by credit card holder.
     */
    public int getPayedAmount() {
        return payedAmount;
    }

    /**
     * Creates a new instance with the specified info.
     *
     * @param creditCard Credit card used for purchase.
     * @param cost  Cost for purchase.
     * @param payedAmount Amount payed by credit card holder.
     */
    public CardReceipt(CreditCard creditCard, int cost, int payedAmount) {
        this.cost = cost;
        this.payedAmount = payedAmount;
        this.creditCard = creditCard;
    }
}
