import fraction.FractionImpl;

public class Main {
    public static void main(String[] args){
        FractionImpl n = new FractionImpl(5, 10);
        FractionImpl n2 = new FractionImpl(1, 2);
        System.out.println(n.inverse());

    }
}
