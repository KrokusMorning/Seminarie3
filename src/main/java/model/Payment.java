package main.java.model;

import main.java.integration.CardTerminal;
import main.java.integration.Printer;
import se.kth.iv1350.payauth.CreditCard;

import java.time.YearMonth;

/**
 * Created by ocean on 2017-04-28.
 */
public class Payment {
    private final Printer PRTR;
    private final CardTerminal CT;

    public Payment(Printer PRTR, CardTerminal CT) {
        this.PRTR = PRTR;
        this.CT = CT;
    }

    public void cardPayment(CreditCard creditCard, int payedAmount, int cost){

        CardReceipt receipt = CT.cardPayment(creditCard, payedAmount, cost);
        PRTR.printCardReceipt(receipt);


    }
}
