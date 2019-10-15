package nyolcadik;

import java.util.Random;
import java.util.Scanner;

public class koPapirOllo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String sajat = "", gep = "";

        while (true){
            while (!((sajat.equals("ko")) || (sajat.equals("papir")) || (sajat.equals("ollo")) || (sajat.equals("vege")))){
                sajat = sc.nextLine();
            }
            if(sajat.equals("vege")){
                break;
            }
            switch (rand.nextInt(3)){
                case 0: gep = "ko"; break;
                case 1: gep = "papir"; break;
                case 2: gep = "ollo"; break;
            }
            System.out.println("Jatekos: " + sajat);
            System.out.println("Gep: " + gep);

            if(sajat.equals(gep)){
                System.out.println("Dontetlen!");
            }else if((sajat.equals("ko") && gep.equals("ollo")) || (sajat.equals("papir") && gep.equals("ko")) || (sajat.equals("ollo") && gep.equals("papir"))){
                System.out.println("Jatekos nyert!");
            }else{
                System.out.println("A gep nyert!");
            }
            sajat = sc.nextLine();
        }
    }
    
}
