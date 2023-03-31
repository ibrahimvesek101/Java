package j24_Encapsulation.encansulation02;

public class Kisi { //pojo class
     /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */

    // 1- fields..

    private String ad;
    private String soyad;
    private String password;
    private int yas;

    // 2- constructor

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas=Math.abs(yas);

      //  setYas(yas);// parametre yas setYasa call edildi. (bu da çalışır.)

    }

    // 3- getter & setter

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);
    }


    // 4- toString() metodu


    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                        ", soyad='" + soyad + '\'' +
                        ", password='" + password + '\'' +
                        ", yas=" + yas;
    }
}// class sonu
