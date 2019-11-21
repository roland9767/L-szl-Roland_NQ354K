package tizedik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
   public static ArrayList<Teherauto> teherbirasTobbmintHusz(Auto[] tomb){
        ArrayList<Teherauto> visszalista = new ArrayList<>();
        for(int i=0; i<tomb.length; i++){
            if(tomb[i] instanceof Teherauto){
                Teherauto a = (Teherauto) tomb[i];
                if(a.getTeherbiras()>20000)
                visszalista.add(a);
            }
        }
        return visszalista;
    }
   
   public static void legnagyobbteljesitmenyuek(ArrayList<Auto> li){
        Collections.sort(li);
        if(li.size()<=3){
            for(Auto ki:li){
                System.out.println(ki);
            }
        }else{
            for(int i=0; i<3; i++){
                System.out.println(li.get(i));
            }
        }
    }
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);      
        String rendszam = sc.nextLine();        
        Auto kocsi = new Auto(rendszam, 100, true);
        System.out.println(kocsi);
        
        Auto [] t = new Auto[4];
        for(int i = 0; i < 4; i++){
            String [] sor = sc.nextLine().split(" ");
            if(i < 2){
                t[i] = new Auto(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]));
            }
            else{
                t[i] = new Teherauto(Integer.parseInt(sor[0]), sor[1], Integer.parseInt(sor[2]), Boolean.parseBoolean(sor[3]));
            }
        }
    }
    
}
