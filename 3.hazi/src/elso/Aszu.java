package elso;

public class Aszu extends Bor{
    
    private int puttonySzam;

    public Aszu(int puttonySzam, String szoloFajta, String termoTerulet, String iz, double alkoholTartam) {
        super(szoloFajta, termoTerulet, iz, alkoholTartam);
        this.puttonySzam = puttonySzam;
    }

     public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }
     
}
