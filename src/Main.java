import fraction.FractionImpl;

public class Main {
    public static void main(String[] args){
        FractionImpl n = new FractionImpl(-10, 5);
        FractionImpl n2 = new FractionImpl(-1, 2);
        System.out.println(n.multiply(n2));

    }
}
