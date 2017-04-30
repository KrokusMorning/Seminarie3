package main.java.model;

import main.java.integration.CardTerminal;
import main.java.integration.Printer;
import se.kth.iv1350.payauth.CreditCard;

import java.time.YearMonth;

/**
 * Class that handles everything associated with a payment.
 */
public class Payment {
    private final Printer PRTR;
    private final CardTerminal CT;

    /**
     * Creates a new instance.
     *
     * @param PRTR Printer to be used
     * @param CT    Card terminal to be used.
     */
    public Payment(Printer PRTR, CardTerminal CT) {
        this.PRTR = PRTR;
        this.CT = CT;
    }

    /**
     * Preforms a card payment and prints receipt.
     *
     * @param creditCard Credit card used for purchase.
     * @param payedAmount Amount payed by holder.
     * @param cost Cost for the purchase.
     */
    public void cardPayment(CreditCard creditCard, int payedAmount, int cost){

        CardReceipt receipt = CT.cardPayment(creditCard, payedAmount, cost);
        PRTR.printCardReceipt(receipt);


    }
}
