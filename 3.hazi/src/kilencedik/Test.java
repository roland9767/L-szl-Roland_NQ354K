package kilencedik;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    
    public static void kiirRendez(ArrayList<Hatizsak> list){        
        Collections.sort(list);
        for(Hatizsak i: list){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Hatizsak> lista = new ArrayList<>();
        lista.add(new Hatizsak("Nike", 10, 1, true));
        lista.add(new Hatizsak("Nike", 20, 2, true));
        lista.add(new Hatizsak("Nike", 30, 3, false));
        lista.add(new Hatizsak("Nike", 40, 4, true));
        lista.add(new Hatizsak("Nike", 50, 5, false));
        lista.add(new Hatizsak("Nike", 60, 6, false));
        lista.add(new Hatizsak("Nike", 70, 7, true));
        lista.add(new Hatizsak("Nike", 80, 8, true));
        lista.add(new Hatizsak("Nike", 90, 9, false));
        lista.add(new Hatizsak("Nike", 100, 10, true));   
        
        kiirRendez(lista);
    }
    
}
