import fraction.Fraction;
import fraction.FractionImpl;

public class Main {
    public static void main(String[] args){
        FractionImpl f1 = new FractionImpl(1, 5);
        FractionImpl f2 = new FractionImpl(3, 4);
        System.out.println(f2.compareTo(f1));
    }
}
