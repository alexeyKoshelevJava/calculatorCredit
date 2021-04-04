import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {



    @Test
void testMonthlyPayment(){

//        given
        int amount = 100000 ;
        int countYears  = 1 ;
        CreditCalculator cr = new CreditCalculator(amount,countYears);

        double expected = 10000 ;
//        when
        double result = cr.monthlyPayment();
//        then
        Assertions.assertEquals(expected,result);

    }
    @Test
    void testOverPayment(){
        //        given
        int amount = 100000 ;
        int countYears  = 1 ;
        CreditCalculator cr = new CreditCalculator(amount,countYears);

        double expected = 10000 ;
//        when
        double result = cr.monthlyPayment();

//        then
        Assertions.assertEquals(expected,result);



    }
    @Test
    void testTotalAmount(){

        //        given
        int amount = 100000 ;
        int countYears  = 1 ;
        CreditCalculator cr = new CreditCalculator(amount,countYears);
        double expected = 120000 ;
//        when
        double result = cr.totalAmount();
//        then
        Assertions.assertEquals(expected,result);



    }

}