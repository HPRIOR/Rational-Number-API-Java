package fraction;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FractionImplTest {

    public FractionImpl n1;
    public FractionImpl n2;
    public FractionImpl n3;
    public FractionImpl n4;
    public FractionImpl n5;
    public FractionImpl n6;
    public FractionImpl n7;
    public FractionImpl n8;
    public FractionImpl n9;
    public FractionImpl n10;
    public FractionImpl n11;
    public FractionImpl n12;

    @Before
    public void setUp(){
        n1 = new FractionImpl(1, 2);
        n2 = new FractionImpl(-3, 47);
        n3 = new FractionImpl(5, -60);
        n4 = new FractionImpl(-7, -89);
        n5 = new FractionImpl(9);
        n6 = new FractionImpl(-10);
        n7 = new FractionImpl("1/2");
        n8 = new FractionImpl("-3/47");
        n9 = new FractionImpl("5/-60");
        n10 = new FractionImpl("-7/-89");
        n11 = new FractionImpl("9");
        n12 = new FractionImpl("-10");



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

        FractionImpl a1 = new FractionImpl("41/94");
        FractionImpl a2 = new FractionImpl("-83/564");
        FractionImpl a3 = new FractionImpl("808/89");
        FractionImpl a4 = new FractionImpl("-19/2");
        FractionImpl a5 = new FractionImpl("-83/564");
        FractionImpl a6 = new FractionImpl("808/89");
        FractionImpl a7 = new FractionImpl("-1/1");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);

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

        FractionImpl a1 = new FractionImpl("53/94");
        FractionImpl a2 = new FractionImpl("11/564");
        FractionImpl a3 = new FractionImpl("-794/89");
        FractionImpl a4 = new FractionImpl("-21/2");
        FractionImpl a5 = new FractionImpl("11/564");
        FractionImpl a6 = new FractionImpl("-794/89");
        FractionImpl a7 = new FractionImpl("19/1");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
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

        FractionImpl a1 = new FractionImpl("-3/94");
        FractionImpl a2 = new FractionImpl("1/188");
        FractionImpl a3 = new FractionImpl("63/89");
        FractionImpl a4 = new FractionImpl("-5/1");
        FractionImpl a5 = new FractionImpl("1/188");
        FractionImpl a6 = new FractionImpl("63/89");
        FractionImpl a7 = new FractionImpl("-90/1");

        assertEquals(test_1, a1);
        assertEquals(test_2, a2);
        assertEquals(test_3, a3);
        assertEquals(test_4, a4);
        assertEquals(test_5, a5);
        assertEquals(test_6, a6);
        assertEquals(test_7, a7);
    }

    @Test
    public void divide() {
        Fraction test_1 = n1.divide(n2);
        Fraction test_2 = n2.divide(n3);
        Fraction test_3 = n4.divide(n5);
        Fraction test_4 = n6.divide(n7);
        Fraction test_5 = n8.divide(n9);
        Fraction test_6 = n10.divide(n11);
        Fraction test_7 = n11.divide(n12);

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
    }

    @Test
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

    }

    @Test
    public void compareTo() {
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




    }
}