package javapk.e8io;

import java.io.*;
import javapk.e5oppilas.Henkilo;

/* 
 * 
 * @author Juha Peltomäki
 */

public class TallennaHenkiloTaulukko {
    
    public static void main(String args[]) {
        String t = "ankat.dat";
        Henkilo[] ankat = new Henkilo[4];
        Henkilo[] luetutAnkat = new Henkilo[4];
        ankat[0] = new Henkilo("Aku Ankka", 45);
        ankat[1] = new Henkilo("Tupu Ankka", 13);
        ankat[2] = new Henkilo("Hupu Ankka", 13);
        ankat[3] = new Henkilo("Lupu Ankka", 13);
        try {
            FileOutputStream kirj = new FileOutputStream(t);
            ObjectOutputStream okirj =
                    new ObjectOutputStream(kirj);
            okirj.writeObject(ankat);
            okirj.flush();
            okirj.close();
            
            // Olion tietojen lukeminen
            FileInputStream luku = new FileInputStream(t);
            ObjectInputStream oluku =
                    new ObjectInputStream(luku);
            luetutAnkat = (Henkilo[]) oluku.readObject();
            oluku.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
        // Tulostetaan taulukko, joka tallennettiin
        System.out.println(luetutAnkat);
        for (int i = 0; i < luetutAnkat.length; i++) {
            System.out.print(luetutAnkat[i].getNimi() + ": ");
            System.out.println(luetutAnkat[i].getIka());
        }
    }
}