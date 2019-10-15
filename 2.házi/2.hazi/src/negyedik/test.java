package negyedik;

import java.util.Arrays;

public class test {
    
    void rendezMaxSzallithatoTeherCsokkenoleg(Teherauto[] teher) {
        Arrays.sort(teher);
    }

    autok keresMaxMotorTeljesitmeny(autok[] auto) {
        autok asd = new autok("asd", 0);
        int max = 0;

        for(int i = 0; i < auto.length; i++) {
            if(auto[i].getMotorTeljesitmeny() > max) {
                asd = auto[i];
                max = auto[i].getMotorTeljesitmeny();
            }
        }
        return asd;
    }

    public void main() {

        autok[] auto = new autok[10];

        auto[0] = new autok("asd-123",100);
        auto[1] = new autok("fgh-123",200);
        auto[2] = new autok("jkl-123",300);
        auto[3] = new autok("qwe-123",400);
        auto[4] = new autok("rtz-123",500);
        auto[5] = new Teherauto("uio-321",600,1100);
        auto[6] = new Teherauto("yxc-321",700,1200);
        auto[7] = new Teherauto("vbn-321",800,1300);
        auto[8] = new Teherauto("mnb-321",900,1400);
        auto[9] = new Teherauto("hgf-321",1000,1500);

        Teherauto[] teherautok = new Teherauto[10];
        teherautok[0] = new Teherauto("pio-321",600,1100);
        teherautok[1] = new Teherauto("zut-321",700,1200);
        teherautok[2] = new Teherauto("gjn-321",800,1300);
        teherautok[3] = new Teherauto("bvc-321",900,1400);
        teherautok[4] = new Teherauto("vbn-321",1000,1500);
        teherautok[5] = new Teherauto("cxy-321",550,950);
        teherautok[6] = new Teherauto("rrt-321",650,1050);
        teherautok[7] = new Teherauto("uzj-321",750,1150);
        teherautok[8] = new Teherauto("jhg-321",850,1250);
        teherautok[9] = new Teherauto("olm-321",950,1350);

        rendezMaxSzallithatoTeherCsokkenoleg(teherautok);
        System.out.println(keresMaxMotorTeljesitmeny(auto));

        for(int i = 0; i < teherautok.length; i++) {
            System.out.println(teherautok[i]);
        }

    }
    
}
