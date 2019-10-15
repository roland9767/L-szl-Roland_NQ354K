package harmadik;

class VendeglatoipariEgyseg{
        private String nev;
        private int ferohelyekszama;
        private boolean dohanyzo;

        public VendeglatoipariEgyseg(String nev, int ferohelyekszama, boolean dohanyzo) {
            this.nev = nev;
            this.ferohelyekszama = ferohelyekszama;
            this.dohanyzo = dohanyzo;
        }

        public String getNev() {
            return nev;
        }

        public int getFerohelyekszama() {
            return ferohelyekszama;
        }

        public void setDohanyzo(boolean dohanyzo) {
            this.dohanyzo = dohanyzo;
        }

        public boolean isDohanyzo() {
            return dohanyzo;
        }

    @Override
    public String toString() {
        return "VendeglatoipariEgyseg{" + "nev=" + nev + ", ferohelyekszama=" + ferohelyekszama + ", dohanyzo=" + dohanyzo + '}';
    }
 
}

class Etterem extends VendeglatoipariEgyseg{
    private String[] etlap;

    public Etterem(String nev, int ferohelyekszama, String[] etlap) {
        super(nev, ferohelyekszama, false);
        this.etlap = etlap;
    }

    public String[] getetlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Etterem{" + "etlap=" + etlap + '}';
    }
 
}

class Kocsma extends VendeglatoipariEgyseg{

    private String[] sorlap;

        public Kocsma(String nev, int ferohelyekszama, String[] sorlap) {
            super(nev, ferohelyekszama, true);
            this.sorlap = sorlap;
        }

        public String[] getSorlap() {
            return sorlap;
        }

        @Override
        public String toString() {
            return this.getNev();
        }
}