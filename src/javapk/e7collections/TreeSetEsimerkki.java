package javapk.e7collections;

import java.util.*;

public class TreeSetEsimerkki {

    public static void main(String[] args) {
        System.out.println("TreeSet esimerkki\n");

        TreeSet<Integer> puu = new TreeSet<Integer>();
        puu.add(40);
        puu.add(20);
        puu.add(60);
        puu.add(10);
        puu.add(30);
        puu.add(10);
        puu.add(50);
        puu.add(70);
        puu.add(5);

        Iterator iterator = puu.iterator();
        System.out.print("Puussa oleva data: ");
        // Tulostetaan puussa oleva data
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //Onko puu tyhjä
        if (puu.isEmpty()) {
            System.out.print("Puu on tyhjä.");
        } else {
            System.out.println("Puun koko on: " + puu.size());
        }

        //Palautetaan ensimmäinen arvo
        System.out.println("Ensimmäinen: " + puu.first());
        //Palautetaan viimeinen arvo
        System.out.println("Viimeinen: " + puu.last());

        // Poistetaan puusta kaksi solmua
        if (puu.remove(30) && puu.remove(50)) {
            System.out.println("Solmut 30/50 poistettu");
        } else {
            System.out.println("Solmua ei ole puussa!");
        }
        System.out.print("Puussa on nyt arvot: ");
        iterator = puu.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Puun koko on: " + puu.size());

    }
}