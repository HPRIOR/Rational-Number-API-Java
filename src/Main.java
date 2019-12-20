import fraction.FractionImpl;

public class Main {
    public static void main(String[] args){
        FractionImpl n = new FractionImpl(-5, 16);
        FractionImpl n2 = new FractionImpl(5, -16);
        System.out.println(n.equals(n2));
        System.out.println(n2);
        System.out.println(n);

    }
}
