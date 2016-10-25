package javapk.e8io;

import java.io.*;

/*
 Tiedon kirjoittaminen ja lukeminen binäärisesti
 */
public class Binaaritiedosto {

    public static void main(String[] args) {

        FileOutputStream fout = null;
        FileInputStream fin = null;
        int x = 101;

        try {
            fout = new FileOutputStream("data.bin");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        try {
            fout.write(x); // Kirjoitetaan vain yksi tavu
            fout.close();
        } catch (IOException e) {
            System.err.println(e);
        }


        try {
            fin = new FileInputStream("data.bin");
            int y = fin.read(); // luetaan yksi tavu
            fin.close();
            System.out.println(y);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (Exception e) {
                System.err.println(e);
            }
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}
