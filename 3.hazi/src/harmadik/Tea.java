package harmadik;

public class Tea implements Rendezheto<Tea> {
    
    public String nev; 
    public int ár;  
    public Tea(String s,int j) {   
        nev=s;   
        ár=j;   
    
    }

    @Override
    public boolean egyenlo(Tea o) {
        return this.ár == o.ár;
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        return this.ár > o.ár;
    }

    @Override
    public boolean kisebbMint(Tea o) {
        return this.ár < o.ár;
    }
    
}
