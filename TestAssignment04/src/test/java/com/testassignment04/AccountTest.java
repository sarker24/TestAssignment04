package com.testassignment04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.function.Function;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import org.hamcrest.number.IsCloseTo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * @author sarke
 */
public class AccountTest {
    private Account account;
    
   
    
    @Test
    public void Default_Balance() {
        account = new Account();
        assertEquals(0, account.getBalance());
    }
    
   @Test
    public void Deposite_positive_amount() {
        double balance = account.getBalance();
        account.deposit(10);
        assertThat(account.getBalance(), is(balance + 10));
    }
    
     @Test
    public void Deposite_negative_amount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
    }

    
    @Test
    public void Withdraw_invalid_amount() {
        account.setBalance(10);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-1));
    }

    
}
