package javapk.e4javaBean;

import java.util.*;

public class NopatBean {
    public static int HEITTOJA = 20;

    private Random rand;

    public NopatBean() {
        rand = new Random();
    }

    public int getNoppa() {
        // palauttaa luvun väliltä 1-6
        return rand.nextInt(6) + 1;
    }

    public int getNopat() {
        // palauttaa välillä 2-12
        return getNoppa() + getNoppa();
    }

    // Testipääohjelma
    public static void main(String args[]) {
        double summa = 0;
        for (int i = 0; i < HEITTOJA; i++) {
          int heitto = new NopatBean().getNopat();
          System.out.printf("Throw %5d. %s\n", i+1, heitto);
          summa += heitto;
        }
          System.out.printf("Average %-8.2f\n", summa/HEITTOJA);

    }

}
