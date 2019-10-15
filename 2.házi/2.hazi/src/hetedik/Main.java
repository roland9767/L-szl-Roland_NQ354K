package hetedik;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        int db = 0;
        Ora tomb[] = new Ora[n];
        while(db != n){
            String[] beolvas = sc.nextLine().split(" ");
            Ora x = new Ora(Integer.parseInt(beolvas[0]),beolvas[1],Integer.parseInt(beolvas[2]));
            tomb[db] = x;
            db++;
        }
        Orarend orarend = new Orarend(nap);
        for(int i = 0; i < db; i++){
            System.out.println(orarend.oratHozzaad(tomb[i]));
        }
        System.out.println(orarend.nap + ": ");
        for(int i = 0; i < orarend.getSzamlalo(); i++){
            System.out.println(orarend.t[i].toString() + " ");
        }
    }
    
}
