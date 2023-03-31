package j31_Map.Tasks;

public class Task02_Kartvizit {// pojo class kartvizit obj field ve method bulunduracak

    String isim;
    String email;
    String adres;
    String telefon;
    int id = 100;

    public Task02_Kartvizit(String isim, String email, String adres, String telefon, int id) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        this.id++;
    }
    // to string


    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", email='" + email + '\'' +
                        ", adres='" + adres + '\'' +
                        ", telefon='" + telefon;
    }
}
