package hu.szamalk.idomok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HasabTest {

    Hasab hasab;

    @Test
    void getA() {
        System.out.println("teszt getter:");
        double kapott = hasab.getA();
        double vart = 2;
        Assertions.assertEquals(vart, kapott);
    }

    @Test
    void setA() {
    }

    @Test
    void getB() {
    }

    @Test
    void setB() {
    }

    @Test
    void getMagassag() {
    }

    @Test
    void setMagassag() {
    }
}