package zh;

import egyetem.Pontozhato;

public class Dolgozat implements Pontozhato{
    
    public int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if(this.pontszam > 35){
            return true;
        }
        else{
            if(this.pontszam == -1){
                System.out.println("Nem írt");
                return false;
            }
        }       
        return false;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }
    
}
