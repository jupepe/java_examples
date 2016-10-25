package javapk.e3olioita;


class ObjectTesti {

    public static void main(String[] args) {
        Object o;
        o = "Merkkijono"; // OK!
        System.out.println("o: " + o);
        // o = 2000; // virhe
        Integer i = new Integer(2000);
        o = i;
        System.out.println("o: " + o);
//    Integer i_olio = o;
        int luku = ((Integer) o).intValue();
        System.out.println("luku: " + new Integer(luku).toString());
    }
}