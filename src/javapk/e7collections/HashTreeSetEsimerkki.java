package javapk.e7collections;

import java.util.*;

public class HashTreeSetEsimerkki {

    public static void main(String args[]) {
        int tmp[] = {30, 20, 10, 60, 40, 50};
        Set<Integer> set = new HashSet<>();
        try {
            // HashSet sisältää solmut, mutta järjestystä ei taattu
            for (int i = 0; i <= 5; i++) {
                set.add(tmp[i]);
            }
            System.out.println("HashSet:" + set);

            // TreeSet pitää solmut järjestyksessä. implementoi SortedSet rajapinnan
            TreeSet<Integer> tree = new TreeSet<>(set);
            System.out.println("TreeSet:" + tree);

            // harj 1. Tulosta puun ensimmäinen ja viimeinen solmu
            System.out.print("1st: " + tree.first()
                    + ",last: " + tree.last() + "\n");

            // harj 2. Tulosta puun solmut järjestyksessä      	  
            Iterator iterator = tree.iterator();
            System.out.print("Puussa oleva data: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + ", ");
            }
            // harj 3. Tulostetaan puun alku- ja loppuosa, 
            // jos erottava alkio on 30. headSet(), tailSet(), subSet() 				
            System.out.println();

            System.out.println("<30:" + tree.headSet(30) + "\n");
            System.out.println(">=30:" + tree.tailSet(30) + "\n");
            // harj. 4 poista alkio 30 puurakenteesta	  
            tree.remove(30);
            System.out.println("poistettu 30: " + tree + "\n");
            // Laajempi esimerkki esim. käyttämällä edellisen kerran
            // class Yhteystieto implements Comparable
            // Tekemällä samat operaatiot tällä luokalla

            // Ensi kerralla käsitellään TreeMap -rakennetta esimerkeistä.				   
        } catch (Exception e) {
        }
    }
}
