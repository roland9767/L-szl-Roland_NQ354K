package zh;

import java.util.Random;

public class Hallgato {
    
    public boolean sokatTanul;
    public int mennyitKeszult;

    public Hallgato(boolean sokatTanul, int mennyitKeszult) {
        this.sokatTanul = sokatTanul;
        this.mennyitKeszult = mennyitKeszult;
    }
    
    public Dolgozat dolgozatotIr(){
        int pontszam = 0;
        if(sokatTanul){
            Random rand = new Random();
            int szam = rand.nextInt(7 - 4) + 1 + 4;
            pontszam = szam * this.mennyitKeszult;
        }
        else{
            Random rand = new Random();
            int szam = rand.nextInt(5) + 1;
            pontszam = szam * this.mennyitKeszult;
        }
        return new Dolgozat(pontszam);
    }
    
}
