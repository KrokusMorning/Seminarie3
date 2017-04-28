package main.java.integration;

import main.java.model.CardReceipt;
import se.kth.iv1350.payauth.CreditCard;
import se.kth.iv1350.payauth.PaymentAuthorization;

/**
 * Created by ocean on 2017-04-27.
 */
public class CardTerminal {
    private final PaymentAuthorization PA;

    public CardTerminal(PaymentAuthorization PA) {
        this.PA = PA;
    }

    public void cardPayment(CreditCard creditCard, int payedAmount, int cost){
        PA.authorizePayment(creditCard, payedAmount);
        CardReceipt receipt = new CardReceipt(cost, payedAmount);


    }
}
