package main.java.integration;

import main.java.model.CardReceipt;

/**
 * Created by ocean on 2017-04-28.
 */
public class Printer {
    public void printCarReceipt(CardReceipt receipt){
        System.out.println("Receipt : Cost: " + receipt.getCost()+" Payed Amount: "+ + receipt.getPayedAmount());
    }
}
