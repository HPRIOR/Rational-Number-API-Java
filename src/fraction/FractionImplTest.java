package fraction;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class FractionImplTest {

    private FractionImpl n1;
    private FractionImpl n1_clone;
    private FractionImpl n2;
    private FractionImpl n3;
    private FractionImpl n4;
    private FractionImpl n4_clone;
    private FractionImpl n5;
    private FractionImpl n6;
    private FractionImpl n7;
    private FractionImpl n8;
    private FractionImpl n8_clone;
    private FractionImpl n9;
    private FractionImpl n10;
    private FractionImpl n11;
    private FractionImpl n12;
    private FractionImpl n13;
    private FractionImpl n14;
    private FractionImpl comp1;
    private FractionImpl comp2;
    private FractionImpl comp3;
    private FractionImpl comp4;
    private FractionImpl comp5;
    private FractionImpl comp6;
    private FractionImpl comp7;

    private Object ArithmeticException;
    private Object NumberFormatException;


    @Before
    public void setUp(){

        // Int constructor
        n1 = new FractionImpl(1, 2);
        n2 = new FractionImpl(-3, 47);
        n3 = new FractionImpl(5, -60);
        n4 = new FractionImpl(-7, -89);

        // Whole number int constructor
        n5 = new FractionImpl(9);
        n6 = new FractionImpl(-10);

        // String constructor tests
        n7 = new FractionImpl("1/2");
        n8 = new FractionImpl("-3/47");
        n9 = new FractionImpl("5/-60");
        n10 = new FractionImpl("-7/-89");

        // Whole number strings
        n11 = new FractionImpl("9");
        n12 = new FractionImpl("-10");

        // Zero in numerator, mathematical checks
        n13 = new FractionImpl(0, 1);
        n14 = new FractionImpl(1,1);

        // clones for immutability check
        n1_clone = new FractionImpl(1, 2);
        n4_clone = new FractionImpl(-7, -89);
        n8_clone = new FractionImpl("-3/47");

        // fractions to compare
        comp1 = new FractionImpl(1,4);
        comp2 = new FractionImpl(2,8);
        comp3 = new FractionImpl(8,8);
        comp4 = new FractionImpl(1,4);
        comp5 = new FractionImpl(-1,4);
        comp6 = new FractionImpl(2,16);
        comp7 = new FractionImpl(100,4);

    }

    @Test (expected = ArithmeticException.class)
    public void instantiateTest(){
        // test for zero in denominator
        FractionImpl error1 = new FractionImpl(1, 0);
        FractionImpl error2 = new FractionImpl("1/0");

        // test for zero numerator
        FractionImpl error3 = new FractionImpl(0);
        FractionImpl error4 = new FractionImpl(0, 1);
        FractionImpl error5 = new FractionImpl("0");
        FractionImpl error6 = new FractionImpl("0/1");

        assertEquals(error1, ArithmeticException);
        assertEquals(error2, ArithmeticException);
        assertNotEquals(error3, ArithmeticException);
        assertNotEquals(error4, ArithmeticException);
        assertNotEquals(error5, ArithmeticException);
        assertNotEquals(error6, ArithmeticException);

    }


    @Test (expected = NumberFormatException.class)
    public void instantiateWithGaps(){
        // legal gaps
        FractionImpl error7 = new FractionImpl(" 8 ");
        FractionImpl error8 = new FractionImpl(" 8 /  8  ");

        // illegal gaps
        FractionImpl error9 = new FractionImpl("8 8");
        FractionImpl error10 = new FractionImpl(" 8 / 8 8");
        FractionImpl error11 = new FractionImpl("8 8 /8");

        assertNotEquals(error7, NumberFormatException);
        assertNotEquals(error8, NumberFormatException);
        assertEquals(error9, NumberFormatException);
        assertEquals(error10, NumberFormatException);
        assertEquals(error11, NumberFormatException);

        assertEquals(error7.toString(), "8/1");
        assertEquals(error9.toString(), "1/1");
    }

    @Test
    public void testAdd() {
        Fraction test_1 = n1.add(n2);
        Fraction test_2 = n2.add(n3);
        Fraction test_3 = n4.add(n5);
        Fraction test_4 = n6.add(n7);
        Fraction test_5 = n8.add(n9);
        Fraction test_6 = n10.add(n11);
        Fraction test_7 = n11.add(n12);
        Fraction test_8 = n13.add(n14);

        FractionImpl a1 = new FractionImpl("41/94");
        FractionImpl a2 = new FractionImpl("-83/564");
        FractionImpl a3 = new FractionImpl("808/89");
        FractionImpl a4 = new FractionImpl("-19/2");
        FractionImpl a5 = new FractionImpl("-83/564");
        FractionImpl a6 = new FractionImpl("808/89");
        FractionImpl a7 = new FractionImpl("-1/1");
        FractionImpl a8 = new FractionImpl("1/1");


        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
        assertEquals(test_8, a8);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test
    public void testSubtract() {
        Fraction test_1 = n1.subtract(n2);
        Fraction test_2 = n2.subtract(n3);
        Fraction test_3 = n4.subtract(n5);
        Fraction test_4 = n6.subtract(n7);
        Fraction test_5 = n8.subtract(n9);
        Fraction test_6 = n10.subtract(n11);
        Fraction test_7 = n11.subtract(n12);
        Fraction test_8 = n13.subtract(n14);

        FractionImpl a1 = new FractionImpl("53/94");
        FractionImpl a2 = new FractionImpl("11/564");
        FractionImpl a3 = new FractionImpl("-794/89");
        FractionImpl a4 = new FractionImpl("-21/2");
        FractionImpl a5 = new FractionImpl("11/564");
        FractionImpl a6 = new FractionImpl("-794/89");
        FractionImpl a7 = new FractionImpl("19/1");
        FractionImpl a8 = new FractionImpl("-1/1");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
        assertEquals(test_8, a8);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test
    public void testMultiply() {
        Fraction test_1 = n1.multiply(n2);
        Fraction test_2 = n2.multiply(n3);
        Fraction test_3 = n4.multiply(n5);
        Fraction test_4 = n6.multiply(n7);
        Fraction test_5 = n8.multiply(n9);
        Fraction test_6 = n10.multiply(n11);
        Fraction test_7 = n11.multiply(n12);
        Fraction test_8 = n13.multiply(n14);

        FractionImpl a1 = new FractionImpl("-3/94");
        FractionImpl a2 = new FractionImpl("1/188");
        FractionImpl a3 = new FractionImpl("63/89");
        FractionImpl a4 = new FractionImpl("-5/1");
        FractionImpl a5 = new FractionImpl("1/188");
        FractionImpl a6 = new FractionImpl("63/89");
        FractionImpl a7 = new FractionImpl("-90/1");
        FractionImpl a8 = new FractionImpl("0/1");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
        assertEquals(test_8, a8);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test (expected = java.lang.ArithmeticException.class)
    public void divide() {
        Fraction test_1 = n1.divide(n2);
        Fraction test_2 = n2.divide(n3);
        Fraction test_3 = n4.divide(n5);
        Fraction test_4 = n6.divide(n7);
        Fraction test_5 = n8.divide(n9);
        Fraction test_6 = n10.divide(n11);
        Fraction test_7 = n11.divide(n12);
        Fraction test_8 = n13.divide(n14);

        FractionImpl a1 = new FractionImpl("-47/6");
        FractionImpl a2 = new FractionImpl("36/47");
        FractionImpl a3 = new FractionImpl("7/801");
        FractionImpl a4 = new FractionImpl("-20/1");
        FractionImpl a5 = new FractionImpl("36/47");
        FractionImpl a6 = new FractionImpl("7/801");
        FractionImpl a7 = new FractionImpl("-9/10");


        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
        assertEquals(test_8, ArithmeticException);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test
    public void abs() {
        Fraction test_1 = n1.abs();
        Fraction test_2 = n2.abs();
        Fraction test_3 = n3.abs();
        Fraction test_4 = n4.abs();
        Fraction test_5 = n5.abs();
        Fraction test_6 = n6.abs();
        Fraction test_7 = n7.abs();
        Fraction test_8 = n8.abs();
        Fraction test_9 = n9.abs();
        Fraction test_10 = n10.abs();
        Fraction test_11 = n11.abs();
        Fraction test_12 = n12.abs();
        Fraction test_13 = n13.abs();

        FractionImpl a1 = new FractionImpl("1/2");
        FractionImpl a2 = new FractionImpl("3/47");
        FractionImpl a3 = new FractionImpl("5/60");
        FractionImpl a4 = new FractionImpl("7/89");
        FractionImpl a5 = new FractionImpl("9/1");
        FractionImpl a6 = new FractionImpl("10/1");
        FractionImpl a7 = new FractionImpl("1/2");
        FractionImpl a8 = new FractionImpl("3/47");
        FractionImpl a9 = new FractionImpl("5/60");
        FractionImpl a10 = new FractionImpl("7/89");
        FractionImpl a11 = new FractionImpl("9/1");
        FractionImpl a12 = new FractionImpl("10/1");
        FractionImpl a13 = new FractionImpl("0/1");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
        assertEquals(test_8, a8);
        assertEquals(test_9, a9);
        assertEquals(test_10, a10);
        assertEquals(test_11, a11);
        assertEquals(test_12, a12);
        assertEquals(test_13, a13);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test
    public void negate() {
        Fraction test_1 = n1.negate();
        Fraction test_2 = n2.negate();
        Fraction test_3 = n3.negate();
        Fraction test_4 = n4.negate();
        Fraction test_5 = n5.negate();
        Fraction test_6 = n6.negate();
        Fraction test_7 = n7.negate();
        Fraction test_8 = n8.negate();
        Fraction test_9 = n9.negate();
        Fraction test_10 = n10.negate();
        Fraction test_11 = n11.negate();
        Fraction test_12 = n12.negate();
        Fraction test_13 = n13.negate();


        FractionImpl a1 = new FractionImpl("-1/2");
        FractionImpl a2 = new FractionImpl("3/47");
        FractionImpl a3 = new FractionImpl("5/60");
        FractionImpl a4 = new FractionImpl("-7/89");
        FractionImpl a5 = new FractionImpl("-9/1");
        FractionImpl a6 = new FractionImpl("10/1");
        FractionImpl a7 = new FractionImpl("-1/2");
        FractionImpl a8 = new FractionImpl("3/47");
        FractionImpl a9 = new FractionImpl("5/60");
        FractionImpl a10 = new FractionImpl("-7/89");
        FractionImpl a11 = new FractionImpl("-9/1");
        FractionImpl a12 = new FractionImpl("10/1");
        FractionImpl a13 = new FractionImpl("0/1");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
        assertEquals(test_8, a8);
        assertEquals(test_9, a9);
        assertEquals(test_10, a10);
        assertEquals(test_11, a11);
        assertEquals(test_12, a12);
        assertEquals(test_13, a13);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test
    public void testEquals() {
        boolean test_1 = n1.equals(n7);
        boolean test_2 = n2.equals(n8);
        boolean test_3 = n3.equals(n1);
        boolean test_4 = n4.equals(n10);
        boolean test_5 = n5.equals(n11);
        boolean test_6 = n6.equals(n12);
        boolean test_7 = n7.equals(n9);
        boolean test_8 = n8.equals(n2);
        boolean test_9 = n9.equals(n3);
        boolean test_10 = n10.equals(n4);
        boolean test_11 = n11.equals(n5);
        boolean test_12 = n12.equals(n11);

        assertTrue(test_1);
        assertTrue(test_2);
        assertFalse(test_3);
        assertTrue(test_4);
        assertTrue(test_5);
        assertTrue(test_6);
        assertFalse(test_7);
        assertTrue(test_8);
        assertTrue(test_9);
        assertTrue(test_10);
        assertTrue(test_11);
        assertFalse(test_12);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test (expected = java.lang.ArithmeticException.class)
    public void inverse() {
        Fraction test_1 = n1.inverse();
        Fraction test_2 = n2.inverse();
        Fraction test_3 = n3.inverse();
        Fraction test_4 = n4.inverse();
        Fraction test_5 = n5.inverse();
        Fraction test_6 = n6.inverse();
        Fraction test_7 = n7.inverse();
        Fraction test_8 = n8.inverse();
        Fraction test_9 = n9.inverse();
        Fraction test_10 = n10.inverse();
        Fraction test_11 = n11.inverse();
        Fraction test_12 = n12.inverse();
        Fraction test_13 = n13.inverse();

        FractionImpl a1 = new FractionImpl("2/1");
        FractionImpl a2 = new FractionImpl("-47/3");
        FractionImpl a3 = new FractionImpl("-60/5");
        FractionImpl a4 = new FractionImpl("89/7");
        FractionImpl a5 = new FractionImpl("1/9");
        FractionImpl a6 = new FractionImpl("-1/10");
        FractionImpl a7 = new FractionImpl("2/1");
        FractionImpl a8 = new FractionImpl("-47/3");
        FractionImpl a9 = new FractionImpl("-60/5");
        FractionImpl a10 = new FractionImpl("89/7");
        FractionImpl a11 = new FractionImpl("1/9");
        FractionImpl a12 = new FractionImpl("-1/10");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
        assertEquals(test_8, a8);
        assertEquals(test_9, a9);
        assertEquals(test_10, a10);
        assertEquals(test_11, a11);
        assertEquals(test_12, a12);
        assertEquals(test_13, ArithmeticException);

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);
    }

    @Test
    public void compareTo() {
        comp1 = new FractionImpl(1,4);
        comp2 = new FractionImpl(2,8);
        comp3 = new FractionImpl(8,8);
        comp4 = new FractionImpl(-1,4);
        comp5 = new FractionImpl(-1,8);
        comp6 = new FractionImpl(-2,16);
        comp7 = new FractionImpl(100,4);

        int test1 = comp1.compareTo(comp2);
        int test2 = comp2.compareTo(comp1);
        int test3 = comp3.compareTo(comp2);
        int test4 = comp1.compareTo(comp3);
        int test5 = comp3.compareTo(comp4);
        int test6 = comp4.compareTo(comp5);
        int test7 = comp5.compareTo(comp6);
        int test8 = comp6.compareTo(comp5);
        int test9 = comp6.compareTo(comp6);
        int test10 = comp7.compareTo(comp1);

        assertEquals(test1, 0);
        assertEquals(test2,0 );
        assertEquals(test3, 1);
        assertEquals(test4, -1);
        assertEquals(test5, 1);
        assertEquals(test6, -1);
        assertEquals(test7, 0);
        assertEquals(test8,0 );
        assertEquals(test9, 0);
        assertEquals(test10, 1);
    }


    @Test
    public void testToString() {
        String test_1 = n1.toString();
        String test_2 = n2.toString();
        String test_3 = n3.toString();
        String test_4 = n4.toString();
        String test_5 = n5.toString();
        String test_6 = n6.toString();
        String test_7 = n7.toString();
        String test_8 = n8.toString();
        String test_9 = n9.toString();
        String test_10 = n10.toString();
        String test_11 = n11.toString();
        String test_12 = n12.toString();

        assertEquals(test_1, "1/2");
        assertEquals(test_2, "-3/47");
        assertEquals(test_3, "-1/12");
        assertEquals(test_4, "7/89");
        assertEquals(test_5, "9/1");
        assertEquals(test_6, "-10/1");
        assertEquals(test_7, "1/2");
        assertEquals(test_8, "-3/47");
        assertEquals(test_9, "-1/12");
        assertEquals(test_10, "7/89");
        assertEquals(test_11, "9/1");
        assertEquals(test_12, "-10/1");

        // test for immutability
        assertEquals(n1, n1_clone);
        assertEquals(n4, n4_clone);
        assertEquals(n8, n8_clone);

    }
}