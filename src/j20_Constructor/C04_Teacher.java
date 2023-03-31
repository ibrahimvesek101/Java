package j20_Constructor;

public class C04_Teacher {// öğrt.obj. üreten kalıphane..

    /*
           Constructor içerisinden yukarıda(class level) tanımlanan object değişkenlerine(instance variable) erişilmek istenirse this keyword kullanılır.
           this keyword, o anda üzerinde işlem yapılan object'in referansını return eder ve böylece nesne değişkenlerine(instance variable) erişilir.
            Ancak nesne değişkenleri(instance variable) ile cons. parametre değişkenlerinin isimleri farklı olsaydı(soyad = Soyad) this keyword gerek kalmayacaktı.
             Bu kural sadece constructor için değil, bütün metotlar için geçerlidir.

 */
    String ad;
    String soyad;
    String brans;
    int id;
    int tecrube;
    double maas;
    boolean emekli;


    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", id=" + id +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekli=" + emekli +
                '}';
    }

    public C04_Teacher() {// p siz cons.

    }

    public void dersSaati(){

        System.out.println("Haftalık 15 ders sonrası extra olur.");



    }

    public C04_Teacher(String ad, String soyad, String brans, int id, int tecrube, double maas, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.id = id;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekli = emekli;
    }
}

