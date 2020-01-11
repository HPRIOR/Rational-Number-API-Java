import fraction.Fraction;
import fraction.FractionImpl;

public class Main {
    public static void main(String[] args){
        FractionImpl f1 = new FractionImpl(2, 8);
        FractionImpl f2 = new FractionImpl(1, 4);
        System.out.println(f1.compareTo(f2));
    }
}
