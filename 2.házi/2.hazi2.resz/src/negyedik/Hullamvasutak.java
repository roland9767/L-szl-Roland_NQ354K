
import java.util.Arrays;
import java.util.Scanner;


class Vasutak implements Comparable<Vasutak>{
    String vasutNev;
    String vilagNev;
    int ido;
    int magassag;

    public Vasutak(String vasutNev, String vilagNev, int magassag, int ido) {
        this.vasutNev = vasutNev;
        this.vilagNev = vilagNev;
        this.ido = ido;
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return this.vasutNev + " (" + this.vilagNev + "): " + this.ido;
    }

    @Override
    public int compareTo(Vasutak o) {
        int diff = Integer.compare(this.ido, o.ido);
        if(diff != 0){
            return diff;
        }
        diff = Integer.compare(this.magassag, o.magassag);
        if(diff != 0){
            return -diff;
        }
        return this.vasutNev.compareTo(o.vasutNev);
    }
    
}

public class Hullamvasutak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        Vasutak[] t = new Vasutak[db];
        
        for(int i = 0; i < db; i++){
            String[] line = sc.nextLine().split(";");
            t[i] = new Vasutak(line[0], line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));
        }
        
        Arrays.sort(t);
        
        for(int i = 0; i < t.length; i++){
            System.out.println(t[i].toString());
        }
    }
    
}