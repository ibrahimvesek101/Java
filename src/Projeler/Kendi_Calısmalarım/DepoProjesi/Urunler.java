package Projeler.Kendi_Calısmalarım.DepoProjesi;

public class Urunler {
    String urunAdı;
    String uretici;
    int miktar;
    String birim;
    String raf;

    public Urunler(String urunAdı, String uretici, int miktar, String birim, String raf) {
        this.urunAdı = urunAdı;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public Urunler() {
    }

    public String getUrunAdı() {
        return urunAdı;
    }

    public void setUrunAdı(String urunAdı) {
        this.urunAdı = urunAdı;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Ürün_Adı: " + urunAdı +
                ", Üretici: " + uretici +
                ", Miktar: " + miktar +
                ", Birim: " + birim  +
                ", Raf: " + raf+"\n";
    }
}
