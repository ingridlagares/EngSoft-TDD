public class DollarTest extends TestCase {
    public void testMultiplication() {
       Money five = Money.dollar(5);
       assertEquals(Money.dollar(10), five.times(2));
       assertEquals(Money.dollar(15), five.times(3));
    }

    public void testEquality() {
       assertTrue(Money.dollar(5).equals(Money.dollar(5)));
       assertFalse(Money.dollar(5).equals(Money.dollar(6)));
       assertTrue(new Franc(5).equals(new Franc(5)));
       assertFalse(new Franc(5).equals(new Franc(6)));
       assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    public static void main(String[] args) throws Exception  {
		JUnitCore.main("DollarTest");
    }
}
