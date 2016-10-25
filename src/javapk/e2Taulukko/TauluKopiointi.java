package javapk.e2Taulukko;

import java.util.Arrays;

public class TauluKopiointi {

 public static void main(String args[]) {
   int[] t = {10,20,30,40,50};
   int[] t2 = {8,7,6,5,4,3,2,1};
   // Arrays.fill(t2, 0);

   for (int i=0; i<t.length; i++) System.out.println(i + ":" + t[i]);
 
   // Kopiointi
   try {
     System.arraycopy(t,0,t2,2,5);
     Arrays.sort(t2);
     for (int i=0; i<t2.length; i++) System.out.println(i + ":" + t2[i]);
   }
   catch (Exception e) { e.printStackTrace(); }
 }
}

