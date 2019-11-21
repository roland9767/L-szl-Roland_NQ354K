package hetedik;

public class Lakohaz implements Comparable<Lakohaz>{
    
    public static final double emeletMagassag = 3.2;
    private String cim;
    private int emeletekSzama;
    private double alapterulet;

    public Lakohaz(String cim, int emeletekSzama, double alapterulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }
    
    public double legkobmeter(){
        return this.alapterulet * this.emeletMagassag * this.emeletekSzama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cim);
        sb.append(", ");
        sb.append(emeletekSzama);
        sb.append(", ");
        sb.append(alapterulet);        
        return sb.toString();
    }

    @Override
    public int compateTo(Lakohaz Lakohaz) {
        if(this.legkobmeter() > Lakohaz.legkobmeter()){
            return 1;
        }
        else{
            if(this.legkobmeter() == Lakohaz.legkobmeter()){
                return 0;
            }
            else{
                return -1;
            }            
        }
    }
   
}
