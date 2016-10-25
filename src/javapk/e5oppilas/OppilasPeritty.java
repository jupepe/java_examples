package javapk.e5oppilas;

public class OppilasPeritty {

    public static void main(String args[]) {
        Oppilas h1 = new Oppilas();
        Oppilas h2 = new Oppilas();
        h1.setNimi("Esa");
        h1.setIka(49);
        h1.setArvosana(3);
        h2.setNimi("Juha");
        h2.setIka(44);
        h2.setArvosana(1);
        System.out.println(h1);
        System.out.println(h2);

    }
}
