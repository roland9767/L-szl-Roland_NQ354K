package ital;

import java.util.Objects;

public class Ital implements Comparable<Ital>{
    
    protected String név;
    protected String kiszerelés;
    protected int ár;
    
    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }
    
    public int getÁr() {
        return ár;
    }
    
    @Override
    public String toString() {
        return név + ", " + kiszerelés + " dl, " + ár + " Ft";
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
        final Ital other = (Ital) obj;
        if (this.ár != other.ár) {
            return false;
        }
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Ital o) {
        if(this.ár > o.ár){
            return 1;
        }
        else{
            if(this.ár == o.ár){
                return 0;
            }
            else{
                return -1;
            }
        }        
    }
    
}
