package hetedik;


public class Ora {

    int kod;
    String oranev;
    int kezdet;

    public Ora(int kod, String oranev, int kezdet) {
        this.kod = kod;
        this.oranev = oranev;
        if(kezdet < 8 && kezdet >=2)
            this.kezdet = 8;
        else if(kezdet > 19 && kezdet < 2)
                this.kezdet = 19;
            else
                this.kezdet = kezdet;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getOranev() {
        return oranev;
    }

    public void setOranev(String oranev) {
        this.oranev = oranev;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", oranev=" + oranev + ", kezdet=" + kezdet + '}';
    }

}