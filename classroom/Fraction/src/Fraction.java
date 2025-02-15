//elab-source:Fraction.java
public class Fraction {
    private int  numerator;
    private int denominator;

    public Fraction(int numerator, int denoinator) {
        this.numerator = numerator;
        this.denominator = denoinator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public Fraction add(Fraction other){
        int p = numerator*other.getDenominator()+other.getNumerator()* denominator;
        int q = denominator * other.getDenominator();
        return  new Fraction(p,q);

    }
    @Override
    public String toString(){
        return numerator+"/"+denominator;
    }
}
