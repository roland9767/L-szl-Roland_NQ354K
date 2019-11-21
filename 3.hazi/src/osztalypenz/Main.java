package osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Penz> lista = new ArrayList();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("0")){
                break;
            }
            String [] sor = s.split(";");
            Penz p = new Penz(sor[0], Integer.parseInt(sor[1]));
            
            if(lista.contains(p)){
                int index = lista.indexOf(p);
                lista.get(index).setOsszeg(lista.get(index).getOsszeg() + Integer.parseInt(sor[1]));
            }
            else{
                lista.add(p);
            }
        }
        Collections.sort(lista);
        for(Penz item : lista){
            System.out.println(item);
        }
    }
    
}

class Penz implements Comparable<Penz>{
    private String nev;
    private int osszeg;

    public Penz(String nev, int osszeg) {
        this.nev = nev;
        this.osszeg = osszeg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return this.nev + ";" + this.osszeg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj == null) || !(obj instanceof Penz)){
            return false;
        }
        Penz p = (Penz)obj;
        return this.nev.equals(p.getNev());
    }

    @Override
    public int compareTo(Penz o) {
        if(this.osszeg == o.getOsszeg()){
            return this.getNev().compareTo(o.getNev());
        }
        else{
            return (-1) * Integer.compare(this.osszeg, o.getOsszeg());
        }
    }
    
}