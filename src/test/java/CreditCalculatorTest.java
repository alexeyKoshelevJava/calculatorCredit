import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {
    CreditCalculator credit;
    @Test
void testMonthlyPayment(){
//        given
        int amount = 100000 ;
        int countYears  = 1 ;
        int percent = 20;
        double expected = 10000 ;
//        when
        double result = credit.monthlyPayment(amount,countYears,percent);
//        then
        Assertions.assertEquals(expected,result);

    }
    @Test
    void testOverPayment(){
        //        given
        int amount = 100000 ;
        int countYears  = 1 ;
        int percent = 20;
        double expected = 20000 ;
//        when
        double result = credit.monthlyPayment(amount,countYears,percent);

//        then
        Assertions.assertEquals(expected,result);



    }
    @Test
    void testTotalAmount(){

        //        given
        int amount = 100000 ;
        int countYears  = 1 ;
        int percent = 20;
        double expected = 120000 ;
//        when
        double result = credit.monthlyPayment(amount,countYears,percent);
//        then
        Assertions.assertEquals(expected,result);



    }

}