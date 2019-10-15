package otodik;

import java.util.Arrays;
import java.util.Scanner;

class Adat implements Comparable{

    String nev;
    int homerseklet;

    public Adat(String nev, int homerseklet) {
        this.nev = nev;
        this.homerseklet = homerseklet;
    }

    @Override
    public int compareTo(Object o) {
        Adat hasonlito = (Adat) o;
        if(this.homerseklet == hasonlito.homerseklet){
            return this.nev.compareTo(hasonlito.nev);
        }
        else{
            return hasonlito.homerseklet - this.homerseklet;
        }
    }

    @Override
    public String toString() {
        return  nev + " (" + homerseklet + ")" ;
    }
}

public class IzzasztoFeladat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String beolvas[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(beolvas[0]);
        if(n != 0){
            String varos = beolvas[1];
            int max = -25982;
            int db = 0;
            Adat[] t = new Adat[n];
            while(db != n){
                beolvas = sc.nextLine().split(":");
                t[db] = new Adat(beolvas[0],Integer.parseInt(beolvas[1]));
                if (beolvas[0].equals(varos)){
                    max = Integer.parseInt(beolvas[1]);
                }
                db++;
            }
            if(max != -25982){
                Arrays.sort(t);
                for (int i = 0; i < db; i++){
                    if(t[i].homerseklet > max){
                        System.out.println(t[i]);
                    }
                }
            }
            else{
                System.out.println("Missing data");
            }
        }
    }
}
