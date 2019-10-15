package hatodik;

import java.util.Arrays;
import java.util.Scanner;

class Adat implements Comparable{
    
    String nev;
    int kekdb;
    int egyebszin;

    public Adat(String nev, int kekdb, int egyebszin) {
        this.nev = nev;
        this.kekdb = kekdb;
        this.egyebszin = egyebszin;
    }

    @Override
    public int compareTo(Object o) {
        Adat x = (Adat)o;
        if(this.kekdb == x.kekdb){
            if(this.egyebszin == x.egyebszin){
                return this.nev.compareTo(x.nev);
            }
            else{
                return x.egyebszin - this.egyebszin;
            }
        }
        else {
            return x.kekdb - this.kekdb;
        }
    }

}

public class MasfelMillioLepes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String beolvas = sc.nextLine();
        int n = Integer.parseInt(beolvas);
        int db = 0;
        Adat[] t = new Adat[n];
        while (db != n){
            String[] s = sc.nextLine().split(";");
            int kekek = 0;
            int egyebek = 0;
            for(int i = 0; i < s[1].length();i++){
                if(s[1].charAt(i) == 'K'){
                    kekek++;
                }
                else if (s[1].charAt(i) != '.'){
                    egyebek++;
                }
            }

            t[db] = new Adat(s[0], kekek, egyebek);
            db++;
        }
        
        Arrays.sort(t);
        
        for(int i = 0; i < n; i++)
            System.out.println(t[i].nev);
    }
    
}
