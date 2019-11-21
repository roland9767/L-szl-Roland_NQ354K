package elso;

public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos {    
    
    private double alkoholTartam;    

    public ErjedtGyumolcs(double alkoholTartam, String fajta, String iz) {
        super(fajta, iz);
        this.alkoholTartam = alkoholTartam;
    }
    
    public double mennyiAlkoholtTartalmaz(){
        return 0;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkoholTartam=" + alkoholTartam + '}';
    }

    @Override
    public double mennnyiAlkoholtTartalmaz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
