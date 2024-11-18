package hu.szamalk;

import hu.szamalk.idomok.FaIdom;
import hu.szamalk.idomok.Gomb;
import hu.szamalk.idomok.Hasab;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
        Gomb g1 = new Gomb(3);
        Gomb g2 = new Gomb(5);
        Hasab h1 = new Hasab(2, 4, 6);
        Hasab h2 = new Hasab(4, 2, 5);
        idomok.add(g1);
        idomok.add(g2);
        idomok.add(h1);
        idomok.add(h2);
    }

    public double osszSuly(){
        double osszsuly = 0;
        for (FaIdom idom : idomok){
            osszsuly += idom.suly();
        }
        return osszsuly;
    }

    public double osszGombSuly(){
        double osszSuly = 0;
        for (FaIdom idom : idomok){
            if (idom instanceof Gomb){
                osszSuly += idom.suly();
            }
        }
        return osszSuly;
    }

    public FaIdom minV(){
        /*
        int legkisebb;
        for (FaIdom idom : idomok){
            if (idom instanceof Gomb &&){

            }
        }
        */
        int m = 0;
        for (int i = 0; i < idomok.size(); i++) {
            FaIdom aktIdom =  idomok.get(i);
            FaIdom mIdom = idomok.get(m);
            if(aktIdom.terfogat() < mIdom.terfogat()){
                m = i;
            }
        }
        return idomok.get(m);
    }

    public FaIdom maxV(){


        int m = 0;
        for (int i = 0; i < idomok.size(); i++) {
            FaIdom aktIdom =  idomok.get(i);
            FaIdom mIdom = idomok.get(m);
            if(aktIdom.terfogat() > mIdom.terfogat()){
                m = i;
            }
        }
        return idomok.get(m);
    }

    public void run(){
        for (FaIdom idom : idomok){
            System.out.println(idom);
        }
        System.out.println("Idomok összes súlya: " + osszSuly());
        System.out.println("Gömbök összes súlya: " + osszGombSuly());
        System.out.println("Min V: " + minV());
        System.out.println("Max V: " + maxV());
    }
}
