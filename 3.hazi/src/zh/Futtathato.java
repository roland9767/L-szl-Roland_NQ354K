package zh;

import java.util.Scanner;

public class Futtathato {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Hallgato [] t = new Hallgato[n];
        for(int i = 0; i < n; i++){
            String [] sor = sc.nextLine().split(" ");
            boolean tanul = false;
            if(sor[1].equals("igaz")){
                tanul = true;
            }
            else{
                if(sor[1].equals("hamis")){
                tanul = false;
                }
            }
            t[i] = new Hallgato(Integer.parseInt(sor[0]), tanul);
        }

        for(int i = 0; i < t.length; i++){
            Dolgozat d1 = new t[i].dolgozatotIr;
            Dolgozat d2 = new t[i].dolgozatotIr;
            if(d1.megfelelt() && d2.megfelelt()){
                System.out.println("Megfelelt");
            }
            else{
                System.out.println("Nem felelt meg");
            }
        }
    }    
}