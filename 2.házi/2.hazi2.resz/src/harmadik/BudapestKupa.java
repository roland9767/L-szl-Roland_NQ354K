package harmadik;

import java.util.Arrays;
import java.util.Scanner;

class Tura implements Comparable {
    String ev;
    String honap;
    String nap;
    String nev;
    int tav;

    public Tura(String ev, String honap, String nap, String nev, int tav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.tav = tav;
    }

    @Override
    public String toString() {
        return this.ev + ";" + this.honap + ";" + this.nap + ";" + this.nev;
    }

    @Override
    public int compareTo(Object o) {
        Tura ujt = (Tura)o;
        int ujturaev = Integer.parseInt(ujt.ev);
        int ujturahonap = Integer.parseInt(ujt.honap);
        int ujturanap = Integer.parseInt(ujt.nap);
        int ujev = Integer.parseInt(this.ev);
        int ujhonap = Integer.parseInt(this.honap);
        int ujnap = Integer.parseInt(this.nap);

        if(ujev == ujturaev){
            if(ujhonap == ujturahonap){
                if(ujnap == ujturanap){
                    return this.nev.compareTo(ujt.nev);
                }
                else{
                    return ujnap - ujturanap;
                }
            }
            else{
                return ujhonap - ujturahonap;
            }
        }
        else{
            return ujev - ujturaev;
        }
    }
}


public class BudapestKupa{
    
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        int db = 0,max = 0;
        Tura[] t = new Tura[N];
        while(db != N){
            String valami = sc.nextLine();
            String[] s = valami.split(";");
            int ossz = 0;
            for(int i = 4; i < s.length; i++){
                ossz = ossz + Integer.parseInt(s[i]);
            }

            if(ossz > max){
                max = ossz;
            }

            Tura sor = new Tura(s[0], s[1], s[2], s[3], ossz);
            t[db] = sor;
            db++;
        }

        Arrays.sort(t);

        for(int i = 0 ; i < N; i++){
            if(t[i].tav == max )
                System.out.println(t[i]);
        }
    }
    
}
