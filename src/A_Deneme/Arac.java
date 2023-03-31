package A_Deneme;

public class Arac {

    String marka;
    String Renk;
    boolean ikinciEl;
    int km;
    int yıl;
    int motor;

    @Override
    public String toString() {
        return
                "Isim : " + marka +
                ", Renk : " + Renk +
                ", ikinciEl : " + ikinciEl +
                ", km : " + km +
                ", yıl : " + yıl +
                ", motor : " + motor;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRenk(String renk) {
        Renk = renk;
    }

    public void setIkinciEl(boolean ikinciEl) {
        this.ikinciEl = ikinciEl;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public String getRenk() {
        return Renk;
    }

    public boolean isIkinciEl() {
        return ikinciEl;
    }

    public int getKm() {
        return km;
    }

    public int getYıl() {
        return yıl;
    }

    public int getMotor() {
        return motor;
    }

    public Arac(String isim, String renk, boolean ikinciEl, int km, int yıl, int motor) {
        marka = isim;
        Renk = renk;
        this.ikinciEl = ikinciEl;
        this.km = km;
        this.yıl = yıl;
        this.motor = motor;
    }

    public Arac() {
        System.out.println("p siz Arac cons calıştı");
    }
}

