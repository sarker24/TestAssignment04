
package com.testassignment04;

/**
 *
 * @author sarke
 */
class creditcard {
     private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
     public static int getDiscount(boolean newCustomer, boolean loyaltyCard, boolean coupon) {
       
        if (newCustomer && loyaltyCard)
            throw new IllegalArgumentException("New customers cannot have right a existing loyalty cards");

        if (coupon && loyaltyCard) return 30;
        else if (coupon) return 20;
        else if (newCustomer) return 15;
        else if (loyaltyCard) return 10;
        else return 0;
    }
}
