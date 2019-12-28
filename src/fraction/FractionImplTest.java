package fraction;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FractionImplTest {


    @Test
    public void testAdd() {
        FractionImpl n1 = new FractionImpl(1, 2);
        FractionImpl n2 = new FractionImpl(-3, 4);
        FractionImpl n3 = new FractionImpl(5, -60);
        FractionImpl n4 = new FractionImpl(-7, -8);
        FractionImpl n5 = new FractionImpl(9);
        FractionImpl n6 = new FractionImpl(-10);
        FractionImpl n7 = new FractionImpl("1/2");
        FractionImpl n8 = new FractionImpl("-3/4");
        FractionImpl n9 = new FractionImpl("5/-6");
        FractionImpl n10 = new FractionImpl("-7/-8");
        FractionImpl n11 = new FractionImpl("9");
        FractionImpl n12 = new FractionImpl("-10");

        FractionImpl a1 = new FractionImpl("-1/4");
        FractionImpl a2 = new FractionImpl("-5/6");
        FractionImpl a3 = new FractionImpl("79/8");
        FractionImpl a4 = new FractionImpl("-19/2");
        FractionImpl a5 = new FractionImpl("-19/12");
        FractionImpl a6 = new FractionImpl("79/8");
        FractionImpl a7 = new FractionImpl("-1/1");


        Fraction test_1 = n1.add(n2);
        Fraction test_2 = n2.add(n3);
        Fraction test_3 = n4.add(n5);
        Fraction test_4 = n6.add(n7);
        Fraction test_5 = n8.add(n9);
        Fraction test_6 = n10.add(n11);
        Fraction test_7 = n11.add(n12);

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
    }

    @Test
    public void testMultiply() {
    }

    @Test
    public void divide() {
    }

    @Test
    public void abs() {
    }

    @Test
    public void negate() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void inverse() {
    }

    @Test
    public void compareTo() {
    }

    @Test
    public void testToString() {
    }
}