package hetedik;

import java.util.Arrays;
import java.util.Scanner;

class Adat implements Comparable{
    
    String angol;
    String magyar;

    public Adat(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    @Override
    public int compareTo(Object o) {
        Adat x = (Adat)o;
        if(this.angol.equals(x.angol)){
            return this.magyar.compareTo(x.magyar);
        }
        else{
            return this.angol.compareTo(x.angol);
        }
    }

    @Override
    public String toString() {
        return angol + ":" + magyar;
    }
}

public class Szotar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int db = 0;
        Adat[] t = new Adat[n];
        while(db != n){
            String[] beolvas = sc.nextLine().split(":");
            t[db] = new Adat(beolvas[0], beolvas[1]);
            db++;
        }
        
        Arrays.sort(t);
        
        for(int i = 0; i < n; i++)
            System.out.println(t[i]);
    }
}
