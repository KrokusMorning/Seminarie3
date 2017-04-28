package main.java.model;

import main.java.integration.CardTerminal;
import main.java.integration.Printer;
import se.kth.iv1350.payauth.CreditCard;

import java.time.YearMonth;
import java.util.Date;

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

    public void cardPayment(int pin, String number, String Holder, YearMonth expiryDate, int CVC, int payedAmount, int cost){
        CreditCard creditCard = new CreditCard(pin, number, Holder, expiryDate, CVC);
        CT.

    }
}
