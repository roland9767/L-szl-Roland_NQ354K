package karacsonyi_hozzavalok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        List<Hozzavalok> lista = new ArrayList();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            /*if(s.equals("0")){
                break;
            }*/
            String [] sor = s.split(";");
            Hozzavalok h = new Hozzavalok(sor[0], Integer.parseInt(sor[1]));
            
            if(lista.contains(h)){
                int index = lista.indexOf(h);
                lista.get(index).setMennyiseg(lista.get(index).getMennyiseg() + Integer.parseInt(sor[1]));
            }
            else{
                lista.add(h);
            }
        }
        Collections.sort(lista);
        for(Hozzavalok item : lista){
            System.out.println(item);
        }
    }
}

class Hozzavalok implements Comparable<Hozzavalok> {
    
    private String hozzavalo;
    private int mennyiseg;

    public Hozzavalok(String hozzavalo, int mennyiseg) {
        this.hozzavalo = hozzavalo;
        this.mennyiseg = mennyiseg;
    }

    public String getHozzavalo() {
        return hozzavalo;
    }

    public void setHozzavalo(String hozzavalo) {
        this.hozzavalo = hozzavalo;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return this.hozzavalo + ";" + this.mennyiseg;
    }

    @Override
    public int compareTo(Hozzavalok o) {
        if(this.mennyiseg == o.getMennyiseg()){
            return this.hozzavalo.compareTo(o.getHozzavalo());
        }
        else{
            return (-1) * Integer.compare(this.mennyiseg, o.getMennyiseg());
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj == null) || !(obj instanceof Hozzavalok)){
            return false;
        }
        //Hozzavalok h = (Hozzavalok)obj;
        //return this.hozzavalo.equals(h.getHozzavalo());
        //ugyan az a ketto
        
        return this.hozzavalo.equals(((Hozzavalok)obj).getHozzavalo());
    }
    
}