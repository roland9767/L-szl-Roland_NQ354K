package tizedik;

public class Teherauto extends Auto {
    
    private int teherbiras;

    public Teherauto(int teherbiras, String rendszám, int teljesítmény, boolean automata) {
        super(rendszám, teljesítmény, automata);
        this.teherbiras = teherbiras;
    }

    @Override
    public String toString() {
        return super.toString() + " " + teherbiras + " kg";
    }

    public int getTeherbiras() {
        return teherbiras;
    }

    public void setTeherbiras(int teherbiras) {
        this.teherbiras = teherbiras;
    }
    
}
