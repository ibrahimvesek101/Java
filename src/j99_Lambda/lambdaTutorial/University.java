package j99_Lambda.lambdaTutorial;

public class University {   //pojo
    String üniversite;
    String bölüm;

    int ogrncSayısı;
    double notOrt;

    public University(String üniversite, String bölüm, int ogrncSayısı, int notOrt) {
        this.üniversite = üniversite;
        this.bölüm = bölüm;
        this.ogrncSayısı = ogrncSayısı;
        this.notOrt = notOrt;
    }

    public String getÜniversite() {
        return üniversite;
    }

    public String getBölüm() {
        return bölüm;
    }

    public int getOgrncSayısı() {
        return ogrncSayısı;
    }

    public double getNotOrt() {
        return notOrt;
    }

    @Override
    public String toString() {
        return
                "üniversite='" + üniversite + '\'' +
                ", bölüm='" + bölüm + '\'' +
                ", ogrncSayısı=" + ogrncSayısı +
                ", notOrt=" + notOrt;
    }
}
