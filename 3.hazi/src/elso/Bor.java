package elso;

public class Bor extends AlkoholosItal{
    
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String iz, double alkoholTartam) {
        super(iz, alkoholTartam);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }
    
    public String milyenSzolobolKeszult(){
        return szoloFajta;
    }
    
    @Override
    public String mibolKeszult(){
        return null;
    }
    
    public String holTerem(){
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }

    @Override
    public String mennyiAlkoholtTartalmaz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String milyenIzu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double mennnyiAlkoholtTartalmaz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
