/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testassignment04;

import static org.hamcrest.core.Is.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author sarke
 */
public class CreditCardTest {
    
      @ParameterizedTest
    @CsvSource({
        "true,false,true, 20",
        "true, false, false, 15",
        "false, true, true, 30",
        "false, true, false, 10",
        "false, false, true, 20",
        "false, false, false, 0",
    })
    public void testDiscountsWithValidInputs(boolean newCustomer, boolean loyaltyCard, boolean coupon, Integer discount) {
        assertThat(CreditCard.getDiscount(newCustomer, loyaltyCard, coupon), is(discount));
    }
}
