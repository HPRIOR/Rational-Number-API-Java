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

    //public FractionImpl(int numerator, int denominator) {
    //    if (denominator == 0) throw new ArithmeticException("Cannot divide by zero");
    //    else {
    //        //check for minus values in either the denominator or numerator and which is greater than which
    //        if (denominator < 0 & numerator < 0){
    //            this.denominator = makePlus(denominator);
    //            this.numerator = makePlus(numerator);
    //            normalise();
    //            this.numerator = makePlus(this.numerator);
    //        }
    //        else if (numerator < 0 & denominator > 0){
    //            this.numerator = makePlus(numerator);
    //            this.denominator = denominator;
    //            normalise();
    //            this.numerator = makePlus(this.numerator);
    //        }
    //        else if (denominator < 0 & numerator > 0){
    //            this.denominator = makePlus(denominator);
    //            this.numerator = numerator;
    //            normalise();
    //            this.numerator = makePlus(this.numerator);
    //        }
    //        else{
    //            //which is greater than which here
    //            int den = normalise2(numerator, denominator)[0];
    //            int num = normalise2(numerator, denominator)[1];
    //            this.numerator = num;
    //            this.denominator = den;
//
    //        }
    //    }
    //}
//

    public FractionImpl(int numerator, int denominator) {
        if (denominator == 0) throw new ArithmeticException("Cannot divide by zero");
        // need to check for which is larger within the check for minus and plus!!!
        // otherwise logically some of the statements will always be false
            // (doesn't know i'm removing minus vales
        else if (numerator > 0 & denominator > 0){
            if (numerator > denominator){
                this.numerator = normalise(numerator, denominator)[0];
                this.denominator = normalise(numerator, denominator)[1];
            }
            else{
                this.numerator = normalise(denominator, numerator)[1];
                this.denominator = normalise(denominator, numerator)[0];
            }
        }
        else if (numerator < 0 & denominator > 0){
            numerator = makePlus(numerator);

        }
        else if (numerator > 0 & denominator < 0){
            denominator = makePlus(denominator);

        }
        else{

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
        // call other constructor by using the 'this' keyword
    }

    private int getNumerator(){return numerator;}

    private int getDenominator(){return denominator;}

    /**
     * Helper method which returns a normalised fraction in constructor
     * handles minus value too
     */
    private int[] normalise(int large, int small) {

        int[] rtrn = new int[2];
        int answer = large / small;
        int prev_answer = large / small;
        int remainder = large % small;
        int GCD = small;
        while (remainder != 0) {
            answer = answer / remainder;
            GCD = remainder;
            remainder = prev_answer % remainder;
            prev_answer = answer;
        }
        rtrn[0] = large / GCD;
        rtrn[1] = small / GCD;

        return rtrn;
    }


    /**
     * Helper method: integer minus to positive, or positive to minus
     */
    // make two different plus and minus ones
    private int makePlus(int n){
        return n*-1;
    }

    private int makeMinus(int n){
        return -n;
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