package masodik_resz;

import java.util.Arrays;

public class Metodusok {
    
    static void elso(int a, int b, int c){
        int[] t;
        t = new int[3];
        t[0] = a;
        t[1] = b;
        t[2] = c;
        Arrays.sort(t);
        System.out.println(t[0] + " " + t[1] + " " + t[2]);
    }
    
    static void masodik(double a, double b, double c){
        double[] t;
        t = new double[3];
        t[0] = a;
        t[1] = b;
        t[2] = c;
        Arrays.sort(t);
        double min = t[0];
        double max = Math.max(Math.abs(t[0]), Math.abs(t[2]));
        System.out.println("min: " + min + " " + "max: " + max);
    }
    
    static void harmadik(double a, double b, double c, double d){
        System.out.println(a + " " + b + " " + c + " " + d);
        if(d >= 0){
            System.out.println(a + " " + c + " " + b + " " + d);
        }
        else{
            System.out.println(a + " " + b + " " + d + " " + c);
        }
    }
    
    static boolean negyedik(double a, double b, double c){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }
        else{
            return false;
        }
    }
    
    static int otodik(int a, int b){
        int db = 0;
        int i;
        for(i = a; i <= b; i++){
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                db++;
            }
        }
        return db;
    }
    
    static void hatodik(int a){
        switch(a){
            case 1:
                System.out.println("Elegtelen");
                break;
            case 2:
                System.out.println("Elegseges");
                break;
            case 3:
                System.out.println("Kozepes");
                break;
            case 4:
                System.out.println("Jo");
                break;
            case 5:
                System.out.println("Jeles");
                break;
            default:
                System.out.println("Rossz a megadott jegy");
        }
    } 
    
    static int hetedik(int a, int b){
        int hanyados = 0;
        while(a >= b){
            hanyados = hanyados + 1;
            a = a - b;
        }
        return hanyados;
    }
    
    static boolean nyolcadik(int n){
        int db = 0;
        int i;
        for(i = 1; i <= n; i++){
            if(n % i == 0){
                db++;
            }
        }
        if(db == 2){
            return true;
        }
        else{
            return false;
        }
    }
    
    static void kilencedik(int n){
        int a = 0, b = 1, c, k;
        if(n == 1){
            System.out.println(a);
        }
        else{
            if(n == 2){
                System.out.println(a + " " + b);
            }
            else{
                c = a + b;
                System.out.print(a + " " + b + " " + c);
                k = 3;
                while(k < n){
                    a = b;
                    b = c;
                    c = a + b;
                    System.out.print(" " + c);
                    k = k + 1;
                }
            }
        }
    }
    
    static int tizedik(int n){
        int ujszam = 0;
        while(n != 0){
            ujszam = ujszam * 10 + (n % 10);
            n = (n / 10);
        }
        return ujszam;
    }
    
    static long tizenegyedik(int n){
        long szam = 1;
        int i;
        for(i = 1; i <= n; i++){
            szam = szam * i;
        }
        return szam;
    }
    
    static void tizenkettedik(int k, int n1, int n2){
        int i;
        for(i = n1; i <= n2; i++){
            if(i % k == 0)
                System.out.print(i + " ");
        }
    }
    
    static int tizenharmadik(int n){
        int a = 0;
        int b = 1;
        int c = a + b;
        while(c <= n)
        {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Elso feladat:");
        elso(56, 2, 13);
        
        System.out.println("Masodik feladat:");
        masodik(-12.6, 86.7, 37);
        
        System.out.println("Harmadik feladat:");
        harmadik(-12.6, 86.7, 37, 3);
        
        System.out.println("Negyedik feladat:");
        System.out.println(negyedik(56, 2, 13));
        
        System.out.println("Otodik feladat:");
        System.out.println(otodik(2000,2010));
        
        System.out.println("Hatodik feladat:");
        hatodik(2);
        
        System.out.println("Hetedik feladat:");
        System.out.println(hetedik(50,15));
        
        System.out.println("Nyolcadik feladat:");
        System.out.println(nyolcadik(2));
        
        System.out.println("Kilencedik feladat:");
        kilencedik(8);
        System.out.println("\n");
        
        System.out.println("Tizedik feladat:");
        System.out.println(tizedik(123456789));
        
        System.out.println("Tizenegyedik feladat:");
        System.out.println(tizenegyedik(7));
        
        System.out.println("Tizenkettedik feladat:");
        tizenkettedik(2,1,10);
        System.out.println("\n");
        
        System.out.println("Tizenharmadik feladat:");
        System.out.println(tizenharmadik(5));
    }    
}
