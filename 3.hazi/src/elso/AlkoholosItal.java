package elso;

public abstract class AlkoholosItal extends Ital implements Alkoholos{
    
    private String iz;
    private double alkoholTartam;

    public AlkoholosItal(String iz, double alkoholTartam) {
        this.iz = iz;
        this.alkoholTartam = alkoholTartam;
    }
    
    public abstract String mennyiAlkoholtTartalmaz();
    
    public abstract String milyenIzu();

    @Override
    public String toString() {
        return "AlkoholosItal{" + "iz=" + iz + ", alkoholTartam=" + alkoholTartam + '}';
    }
    
}
