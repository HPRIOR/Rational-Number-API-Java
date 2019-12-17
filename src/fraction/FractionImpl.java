package fraction;

import javafx.util.Pair;

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
            //check for minus values in either the denominator or numerator
            if (denominator < 0 & numerator < 0){
                this.denominator = makeMinusPlus(denominator);
                this.numerator = makeMinusPlus(numerator);
                normalise();
                this.numerator = makeMinusPlus(this.numerator);
            }
            else if (numerator < 0 & denominator > 0){
                this.numerator = makeMinusPlus(numerator);
                this.denominator = denominator;
                normalise();
                this.numerator = makeMinusPlus(this.numerator);
            }
            else if (denominator < 0 & numerator > 0){
                this.denominator = makeMinusPlus(denominator);
                this.numerator = numerator;
                normalise();
                this.numerator = makeMinusPlus(this.numerator);
            }
            else{
                int den = normalise2(numerator, denominator)[0];
                int num = normalise2(numerator, denominator)[1];
                this.numerator = num;
                this.denominator = den;

            }
        }
    }

    /**
     * The parameter is the numerator and 1 is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
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
        // this should make this.d+n the int representation of the string, then
        // this should be normalised with the void function below
    }

    private int getNumerator(){
        return numerator;
    }

    private int getDenominator(){
        return denominator;
    }

    /**
     * Helper method which returns a normalised fraction in constructor
     * handles minus value too
     */
    private void normalise(){
        if (numerator > denominator){
            int answer = numerator/denominator;
            int prev_answer = numerator/denominator;
            int remainder = numerator % denominator;
            int prev_remainder = denominator;
            while (remainder != 0){
                answer = answer/remainder;
                prev_remainder = remainder;
                remainder = prev_answer%remainder;
                prev_answer=answer;
            }
            denominator = denominator/prev_remainder;
            numerator = numerator/prev_remainder;
        }
        else if (denominator > numerator){
            int answer = denominator/numerator;
            int prev_answer = denominator/numerator;
            int remainder = denominator % numerator;
            int prev_remainder = numerator;
            while (remainder != 0){
                answer = answer/remainder;
                prev_remainder = remainder;
                remainder = prev_answer%remainder;
                prev_answer=answer;
            }
            denominator = denominator/prev_remainder;
            numerator = numerator/prev_remainder;

        }
        // if numerator = denominator
        else{
            this.numerator = 1;
            this.denominator = 1;
        }
    }

    private int[] normalise2(int arg1, int arg2){
        int[] rtrn = new int[2];
        int answer = arg1/arg2;
        int prev_answer = arg1/arg2;
        int remainder = arg1 % arg2;
        int prev_remainder = arg2;
        while (remainder != 0){
            answer = answer/remainder;
            prev_remainder = remainder;
            remainder = prev_answer%remainder;
            prev_answer=answer;
        }
        rtrn[0] = arg2/prev_remainder;
        rtrn[1] = arg1/prev_remainder;
        return rtrn;
        }

    /**
     * Helper method: integer minus to positive, or positive to minus
     */
    private int makeMinusPlus(int n){
        if (n < 0) return n*-1;
        else if (n > 0) return -n;
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