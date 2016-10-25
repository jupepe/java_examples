package javapk.e5oppilas;

public class Oppilas extends Henkilo {

    private int arvosana;

    public Oppilas() {
        super();
        arvosana = -1;
    }

    public Oppilas(String n, int i, int a) {
        super(n, i);
        arvosana = a;
    }

    public String toString() {
        String mj = super.toString() + ", " + arvosana;
        return mj;
    }

    public void setArvosana(int a) {
        arvosana = a;
    }

    public int getArvosana() {
        return arvosana;
    }
}
