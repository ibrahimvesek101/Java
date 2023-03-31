package Projeler.sunum_depo_proje.DepoYonetimii;

public class Urun {// pojo class

    private int urunId;
    private int urunMiktar;
    private String urunİsim;
    private String uretici;
    private String urunBirim;
    private int rafNo;

    public Urun() {
    }
    public Urun(int urunId, String urunİsim, String uretici, String urunBirim) {
        this.urunId = urunId;
        this.urunİsim = urunİsim;
        this.uretici = uretici;
        this.urunBirim = urunBirim;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public int getUrunMiktar() {
        return urunMiktar;
    }

    public void setUrunMiktar(int urunMiktar) {
        this.urunMiktar = urunMiktar;
    }

    public String getUrunİsim() {
        return urunİsim;
    }

    public void setUrunİsim(String urunİsim) {
        this.urunİsim = urunİsim;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getUrunBirim() {
        return urunBirim;
    }

    public void setUrunBirim(String urunBirim) {
        this.urunBirim = urunBirim;
    }

    public int getRafNo() {
        return rafNo;
    }

    public void setRafNo(int rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "urunId=" + urunId +
                ", urunMiktar=" + urunMiktar +
                ", urunİsim='" + urunİsim + '\'' +
                ", uretici='" + uretici + '\'' +
                ", urunBirim='" + urunBirim + '\'' +
                ", rafNo=" + rafNo +
                '}';
    }
}
