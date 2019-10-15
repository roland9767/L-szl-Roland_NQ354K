package harmadik;

public class Main {
     public static void main(String[] args) {


            VendeglatoipariEgyseg[] VIE = new VendeglatoipariEgyseg[10];

            VIE[0] = new Etterem("1",10, new String[]{"leves", "hus", "koret"});
            VIE[1] = new Etterem("2",20, new String[]{"leves", "hus", "koret"});
            VIE[2] = new Etterem("3",30, new String[]{"leves", "hus", "koret"});
            VIE[3] = new Etterem("4",40, new String[]{"leves", "hus", "koret"});
            VIE[4] = new Etterem("5",50, new String[]{"leves", "hus", "koret"});

            VIE[5] = new Kocsma("6",10, new String[]{"borsodi", "miller", "soproni"});
            VIE[6] = new Kocsma("7",20, new String[]{"borsodi", "miller", "soproni"});
            VIE[7] = new Kocsma("8",30, new String[]{"borsodi", "miller", "soproni"});
            VIE[8] = new Kocsma("9",40, new String[]{"borsodi", "miller", "soproni"});
            VIE[9] = new Kocsma("10",50, new String[]{"borsodi", "miller", "soproni"});


            for(Kocsma element : adottItaltKinaloKocsmak("dreher",VIE)){
                System.out.println(element);
            }

        }
        public static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] t)
        {
            Kocsma[] lista = new Kocsma[10];
            int listadarabszam = 0;

            for(int i = 0; i < t.length; i++) {
                if(t[i] instanceof Kocsma) {
                    Kocsma kocs = (Kocsma)t[i];
                    String[] sorlap = kocs.getSorlap();
                    for(int k = 0; k < sorlap.length; k++) {
                        if(sorlap[k] == ital){
                            lista[listadarabszam++] = kocs;
                        }
                    }
                }
            }
            Kocsma[] tomb = new Kocsma[listadarabszam];
            for (int j = 0; j < listadarabszam; j++){
                tomb[j] = lista[j];
            }
            return tomb;
        }
}
