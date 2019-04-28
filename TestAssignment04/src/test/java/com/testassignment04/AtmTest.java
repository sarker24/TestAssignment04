
package com.testassignment04;
 
import static org.hamcrest.core.Is.is;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.RepeatedTest;

/**
 *
 * @author sarke
 */
public class AtmTest {
    
   private ATM_Machine atm;
   
   
  @Test
    public void No_Card_inserted() {
        atm.insertCard(card);
        assertThat(atm.isReadyForMoneyOperations(), is(true));
        assertThat(atm.isAcceptingCards(), is(false));
    }
    
     @RepeatedTest(5)
    public void eject_Card() {
        atm.ejectCard();
        assertThat(atm.isAcceptingCards(), is(true));
    }
}
