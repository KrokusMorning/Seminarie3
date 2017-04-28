package main.java.model;

/**
 * Created by ocean on 2017-04-28.
 */
public class CardReceipt {
    private final int cost;
    private final int payedAmount;

    public int getCost() {
        return cost;
    }

    public int getPayedAmount() {
        return payedAmount;
    }

    public CardReceipt(int cost, int payedAmount) {
        this.cost = cost;
        this.payedAmount = payedAmount;
    }
}
