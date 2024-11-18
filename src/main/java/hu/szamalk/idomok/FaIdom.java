package hu.szamalk.idomok;

abstract public class FaIdom{
    private static double fajSuly = 0.8;

    abstract public double terfogat();

    public double suly(){
        return this.terfogat() * FaIdom.fajSuly;
    }

    @Override
    public String toString() {
        return "FaIdom{}";
    }
}
