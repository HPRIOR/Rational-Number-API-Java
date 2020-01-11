package fraction;



public class FractionImpl implements Fraction {
    /**
     * Parameters are the numerator and the denominator.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are (8, -12), create a Fraction with numerator
     * -2 and denominator 3.
     * <p>
     * The constructor should throw an ArithmeticException if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    private int numerator;
    private int denominator;

    public FractionImpl(int numerator, int denominator) {
        // should account for n = d
        if (denominator == 0) throw new ArithmeticException("Denominator cannot be zero");
        else if(numerator == 0){
            this.numerator = 0;
            this.denominator = denominator;
        }
        else normalise(numerator, denominator);
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
        // this needs to handle 0 values in the denominator, throw arithmetic exception
       if (fraction.contains("/")) {
           // splits string between '/' to produce an array of two strings
           String[] fractionSplit = fraction.split("/", 2);
           // removes white spaces on either side of strings, but not in between
           int index = 0;
           for (String x : fractionSplit) {
               fractionSplit[index] = x.trim();
               index++;
           }
           // attempts to convert strings to integers, failure resulting from spaces in between integers, or wrong type
           // throw error message
           try {
               int stringIntNumerator = Integer.parseInt(fractionSplit[0]);
               int stringIntDenominator = Integer.parseInt(fractionSplit[1]);
               if (stringIntDenominator == 0){
                   throw new ArithmeticException("Denominator cannot be zero");
               }
               else if (stringIntNumerator == 0){
                   numerator = 0;
                   denominator = stringIntDenominator;
               }
               else normalise(stringIntNumerator, stringIntDenominator);
           } catch (NumberFormatException e2) {
               throw new NumberFormatException("error, enter an integer numerator and/or denominator without spaces in between");
           }
       }
       // if input string is a whole number
       else{
           try{
               numerator = Integer.parseInt(fraction.trim());
               denominator = 1;
           } catch (NumberFormatException e1){
               throw new NumberFormatException("error, enter an integer numerator and/or denominator without spaces in between");
           }
       }
    }


    /**
     * Helper method which returns a normalised fraction in constructor
     * handles the difference between numerator or denominator
     * this should handle minus and plus
     */
    private void normalise(int numerator, int denominator) {
        int large;
        int small;
        boolean minusFlag = false;
        if (numerator < 0 ^ denominator < 0) {
            numerator = makePlus(numerator);
            denominator = makePlus(denominator);
            minusFlag = true;
        }
        if (numerator > denominator) {
            large = numerator;
            small = denominator;
        } else {
            large = denominator;
            small = numerator;
        }
        int GCD = gCd(small, large);
        if (minusFlag){
            this.numerator = makeMinus(numerator / GCD);
        }
        else{
            this.numerator = numerator / GCD;
        }
        this.denominator = denominator / GCD;

    }

    private int return_GCD(int numerator, int denominator){
        // use this in the method above (normalisation)
        if (denominator > numerator){
            return gCd(numerator, denominator);
        }
        else{
            return gCd(denominator, numerator);
        }
    }

    private int gCd(int small, int large){
        int r = large % small;
        int previous_r = r;
        if (r == 0){
            return small;
        }
        else{
            while (r != 0){
                previous_r = r;
                r = small % r;
                small = previous_r;
            }
            return previous_r;
        }

    }

    /**
     * Helper method: makes integer plus
     */
    private int makePlus(int n){
        if (n < 0) return n * -1;
        else return n;
    }

    /**
     * Helper method makes integer minus
     *
     */
    private int makeMinus(int n){
        if (n > 0) return -n;
        else return n;
    }


    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        // cast type of f to FractionImpl
        FractionImpl fImple = (FractionImpl) f;
        int newNumerator = (this.numerator * fImple.denominator) + (this.denominator * fImple.numerator);
        int newDenominator = (this.denominator*fImple.denominator);
        return new FractionImpl(newNumerator, newDenominator);

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        FractionImpl fImple = (FractionImpl) f;
        int newNumerator = (this.numerator * fImple.denominator) - (this.denominator * fImple.numerator);
        int newDenominator = (this.denominator*fImple.denominator);
        return new FractionImpl(newNumerator, newDenominator);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl fImple = (FractionImpl) f;
        int newNumerator = this.numerator * fImple.numerator;
        int newDenominator = this.denominator * fImple.denominator;
        return new FractionImpl(newNumerator, newDenominator);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl fImple = (FractionImpl) f;
        if (this.numerator == 0 || fImple.numerator == 0){
            throw new ArithmeticException("cannot divide by zero");
        }
        else{
            int newNumerator = this.numerator * fImple.denominator;
            int newDenominator = this.denominator * fImple.numerator;
            return new FractionImpl(newNumerator, newDenominator);
        }

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        // this may return the same object rather than creating a new fraction
        if (this.numerator > 0) return this;
        else { return new FractionImpl(makePlus(this.numerator), this.denominator);}
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        if (this.numerator > 0) {
            return new FractionImpl(makeMinus(this.numerator), this.denominator);
        }
        else {
            return new FractionImpl(makePlus(this.numerator), this.denominator);
        }
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
        if(!(obj instanceof Fraction)) return false;
        else{
            FractionImpl compareFraction = (FractionImpl) obj;
            return compareFraction.denominator == this.denominator &
                    compareFraction.numerator == this.numerator;
        }
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
        return new FractionImpl(this.denominator, this.numerator);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        FractionImpl fImple = (FractionImpl) o;
        if (fImple.denominator == this.denominator){
            return Integer.compare(fImple.numerator, this.numerator);
        }
        else{
            int times = fImple.denominator * this.denominator;
            int thisComNum = this.numerator * fImple.denominator;
            int fImpleComNum = fImple.numerator * this.denominator;
            return Integer.compare(fImpleComNum, thisComNum);

        }

    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        String den_str = String.valueOf(denominator);
        String num_str = String.valueOf(numerator);
        return num_str + '/' + den_str;
    }
}