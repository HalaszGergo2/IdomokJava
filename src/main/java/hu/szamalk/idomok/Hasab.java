package hu.szamalk.idomok;

public class Hasab extends FaIdom{
    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    public double terfogat(){
        return a*b*magassag;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "Hasab{" +
                "a=" + a +
                ", b=" + b +
                ", magassag=" + magassag +
                '}';
    }
}
