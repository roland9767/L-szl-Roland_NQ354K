package masodik;

import java.util.Scanner;

 class Adatok{
    String nev;
    String megelozo;
    
    public Adatok(String nev, String megelozo) {
        this.nev = nev;
        this.megelozo = megelozo;

    }
}

public class Fejesek2 {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        String[] elsosor = sc.nextLine().split(";");
        n = Integer.parseInt(elsosor[0]);
        String elsonev = elsosor[1];
        String X = elsosor[2];

        int db = 0;
        int hanyadik = 0;

        Adatok[] t = new Adatok[n - 1];

        while(db != n - 1){
            String[] adatok = sc.nextLine().split(";");
            t[db] = new Adatok(adatok[0], adatok[1]);

            db++;
        }

        String asd = X;
        while(!asd.equals(elsonev)){
            for(int i = 0; i < db; i++){
                if(t[i].nev.equals(asd)) {
                    asd = t[i].megelozo;
                    break;
                }
            }
            hanyadik++;
        }
        int piros = hanyadik / 2 + hanyadik % 2;
        int kék = hanyadik / 2;
        System.out.println(piros + " " + kék);
    }
    
}