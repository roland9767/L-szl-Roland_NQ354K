package kilencedik;

public class Hatizsak implements Comparable<Hatizsak>{
    
    private String marka;
    private double urtartalom;
    private int zsebekSzama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak{" + "marka=" + marka + ", urtartalom=" + urtartalom + ", zsebekSzama=" + zsebekSzama + ", vizhatlan=" + vizhatlan + '}';
    }
    
    
    @Override
    public int compateTo(Hatizsak Hatizsak) {
        if(this.marka != Hatizsak.getMarka()){
            return this.marka.compareTo(Hatizsak.getMarka());
        }
        else{
            return Hatizsak.getZsebekSzama() - this.zsebekSzama;
        }
    }
    
}
