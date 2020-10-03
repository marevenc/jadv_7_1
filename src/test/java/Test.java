import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    public void testMonthlyPayment(){
        Credit credit = new Credit(100_000, 12, 9.5);
        int actual = 8768;

        Assertions.assertEquals(credit.calcMonthlyPayment(), actual);

    }

    @org.junit.jupiter.api.Test
    public void testCreditSum(){
        Credit credit = new Credit(100_000, 12, 9.5);
        int actual = 105_216;

        Assertions.assertEquals(credit.calcCreditSum(), actual);
    }

    @org.junit.jupiter.api.Test
    public void testOverpayment(){
        Credit credit = new Credit(100_000, 12, 9.5);
        int actual = 5216;

        Assertions.assertEquals(credit.calcOverpayment(), actual);
    }
}
