package elso;

public class Main {
    private static Aszu[] otputtonyos (Bor[] tomb) {
        int n = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] instanceof Aszu) {
                Aszu aszu = (Aszu) tomb[i];
                if (aszu.hanyPuttonyos() == 5) {
                    n++;
                }
            }
        }
        Aszu[] aszutomb = new Aszu[n];
        n = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] instanceof Aszu) {
                Aszu aszu = (Aszu) tomb[i];
                if (aszu.hanyPuttonyos() == 5) {
                    aszutomb[n++] = aszu;
                }
            }
        }
        return aszutomb;
    }

   public static void main(String[] args) {
        Bor[] bor = {
        new Bor("Rosé", 10.5, "Vegyes", "Eger"),
        new Bor("Édes", 6.3, "Furmint", "Tokaj"),
        new Aszu("Édes", 7.8, "Aszú", "Tokaj", 5),
        new Bor("Félédes", 7.3, "Hárslevelű", "Villány"),
        new Aszu("Száraz", 6.9, "Aszú", "Tokaj", 3)
        };

       Aszu[] aszuk_tomb = otputtonyos(bor);

        for (Aszu j : aszuk_tomb)
            System.out.println(j);
    }
}
