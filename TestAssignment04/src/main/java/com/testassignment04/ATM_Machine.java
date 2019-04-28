
package com.testassignment04;

/**
 *
 * @author sarke
 */
public class ATM_Machine {
    private creditcard card;
    
    public void ejectCard() {
        this.card = null;
    }
    
     public boolean isReadyForMoneyOperations() {
        return this.card != null;
    }

    public boolean isAcceptingCards() {
        return this.card == null;
    }
    
    
    
}
