import fraction.Fraction;
import fraction.FractionImpl;

public class Main {
    public static void main(String[] args){
        FractionImpl f1 = new FractionImpl("20/ 20");
        FractionImpl f2 = new FractionImpl("10/ 10");
        System.out.println(f1.equals(f2));
    }
}
