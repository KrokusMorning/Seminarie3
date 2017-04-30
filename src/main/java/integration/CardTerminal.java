package main.java.integration;

import main.java.model.CardReceipt;
import se.kth.iv1350.payauth.CreditCard;
import se.kth.iv1350.payauth.PaymentAuthorization;

/**
 * The class represent a card terminal.
 */
public class CardTerminal {
    private final PaymentAuthorization PA;

    /**
     * Creates a new instance representing a card terminal.
     *
     * @param PA Payment authorization to be used.
     */
    public CardTerminal(PaymentAuthorization PA) {
        this.PA = PA;
    }

    /**
     * Authorizes card payment and prints receipt.
     * @param creditCard    Credit card used for purchase.
     * @param payedAmount     Amount payed by holder.
     * @param cost  Cost for the purchase.
     * @return     Receipt of the card payment.
     */
    public CardReceipt cardPayment(CreditCard creditCard, int payedAmount, int cost){
        if (PA.authorizePayment(creditCard, payedAmount)){
        CardReceipt receipt = new CardReceipt(creditCard, cost, payedAmount);
        return receipt;}
        return null;
    }
}
