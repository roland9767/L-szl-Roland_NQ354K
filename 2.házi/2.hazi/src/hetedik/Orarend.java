package hetedik;

public class Orarend {
    String nap;
    Ora t[];
    int szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo = 0;
        this.t = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getT() {
        return t;
    }

    public void setT(Ora[] t) {
        this.t = t;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    @Override
    public String toString() {
        return "nap: " + nap + t.toString();
    }

    boolean oratHozzaad(Ora ora)
    {
        if ( szamlalo == 0 ) {
            t[szamlalo] = ora;
            szamlalo++;
            return true;
        }

        if(szamlalo < 12) {
            for(int i = 0; i < szamlalo; i++) {
                if ( t[i].kezdet != ora.kezdet ) {
                    t[szamlalo] = ora;
                    szamlalo++;
                    return true;
                }
                else
                    return false;
            }
        }
        return false;
    }
}
