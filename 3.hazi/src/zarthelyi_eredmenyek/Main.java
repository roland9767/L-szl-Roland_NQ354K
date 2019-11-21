package zarthelyi_eredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Eredmenyek> lista = new ArrayList();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("0")){
                return;
            }
            String [] sor = s.split(";");
            Eredmenyek e = new Eredmenyek(sor[0], Integer.parseInt(sor[1]));
            
            if(lista.contains(e)){
                int index  = lista.indexOf(e);
                lista.get(index).setPont(lista.get(index).getPont() + Integer.parseInt(sor[1]));
            }
        }
        Collections.sort(lista);
        for(Eredmenyek item : lista){
            System.out.println(item);
        }
    }
    
}

class Eredmenyek implements Comparable<Eredmenyek> {
    private String nev;
    private int pont;

    public Eredmenyek(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return this.nev + ": " + this.pont + " pont";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj == null) || !(obj instanceof Eredmenyek) ){
            return false;
        }
        Eredmenyek e = (Eredmenyek)obj;
        return this.nev.equals(e.getNev());
    }

    @Override
    public int compareTo(Eredmenyek o) {
        if(this.pont == o.getPont()){
            return this.nev.compareTo(o.getNev());
        }
        else{
            return (-1) * Integer.compare(this.pont, o.getPont());
        }
    }
    
}