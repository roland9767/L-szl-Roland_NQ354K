package negyedik;

import java.util.Date;

public class autok {
    
    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasDatuma;

    public autok(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasDatuma() {
        return gyartasDatuma;
    }

    @Override
    public String toString() {
        return "autok{" + "rendszam=" + rendszam + ", motorTeljesitmeny=" + motorTeljesitmeny + ", gyartasDatuma=" + gyartasDatuma + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Teherauto extends autok implements Comparable{
    private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "Teherauto{" + "maxSzallithatoTeher=" + maxSzallithatoTeher + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        Teherauto x =  (Teherauto)o;
        return x.maxSzallithatoTeher - this.maxSzallithatoTeher;
    }
}


