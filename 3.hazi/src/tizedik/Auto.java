package tizedik;

import java.util.Objects;

public class Auto implements Comparable<Auto>{
    
     private String rendszam;   
     private int teljesítmény;  
     private boolean automata;

    public Auto(String rendszam, int teljesítmény, boolean automata) {
        this.rendszam = rendszam;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendsz\u00e1m=" + rendszam + ", teljes\u00edtm\u00e9ny=" + teljesítmény + ", automata=" + automata + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if(!Objects.equals(this.rendszam, other.rendszam)){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Auto o) {
        if(this.getTeljesítmény() > o.getTeljesítmény()){
            return 1;
        }
        else if(this.getTeljesítmény() < o.getTeljesítmény()){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    public boolean szabalyosRendszam(){
        if(getRendszam().length() == 6){
            if(Character.isAlphabetic(getRendszam().charAt(0))){
                if(Character.isAlphabetic(getRendszam().charAt(1))){
                    if(Character.isAlphabetic(getRendszam().charAt(2))){
                        if(Character.isDigit(getRendszam().charAt(3))){
                            if(Character.isDigit(getRendszam().charAt(4))){
                                if(Character.isDigit(getRendszam().charAt(5))){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }        
        return false;
    }
    
}
