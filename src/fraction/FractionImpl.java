package fraction;

public class FractionImpl implements Fraction {
    /**
     * Parameters are the numerator and the denominator.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are (8, -12), create a Fraction with numerator
     * -2 and denominator 3.
     *
     * The constructor should throw an ArithmeticException if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    private int numerator;
    private int denominator;

    public FractionImpl(int numerator, int denominator) {
        if (denominator == 0) throw new ArithmeticException("Cannot divide by zero");
        else {
            //handle minuses here
            this.denominator = denominator;
            this.numerator  = numerator;
            gcd();
        }
    }

    /**
     * The parameter is the numerator and 1 is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        // TODO
    }

    /**
     * The parameter is a String containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an ArithmeticException
     * if given a string representing a fraction whose denominator is zero.
     *
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        // TODO
    }

    /**
     * Helper method which returns a normalised fraction in constructor
     */
    private void gcd(){
        if (this.numerator > this.denominator){

        }
        else if (this.denominator > this. numerator){

        }
        // if numerator = denominator
        else{
            this.numerator = 1;
            this.denominator = 1;
        }
    }

    /**
     * Helper method to make an integer minus or positive
     */
    private int makeMinusPlus(int n){
        if (n < 0) return n + n*2;
        else if (n > 0) return n - n*2;
        else return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        // Handle improper fractions
        String den_str = String.valueOf(denominator);
        String num_str = String.valueOf(numerator);
        return num_str + '/' + den_str;
    }
}