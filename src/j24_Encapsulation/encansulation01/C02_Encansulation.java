package j24_Encapsulation.encansulation01;

public class C02_Encansulation {    //pojo Class

    /*
Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
basit bir veri nesnesi olabilirler. POJO'lar, genellikle diğer nesneler veya bileşenlerle
 işbirliği yapmak için kullanılırlar ve bu nedenle veri aktarım nesneleri (DTO) olarak da adlandırılabilirler.
 */


    // fields (private)

    String name="ibrahim";
    private int id=101;
    private String mail="abc@example.com";

    public C02_Encansulation(String name, int id, String mail) {
        this.name = name;
        this.id = id;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public C02_Encansulation() { //p siz cons.

    }
 //   public String mailVer() {
 //       return mail;
 //   }
 //   public int idVer() {
 //       return id;
 //   }

}//class sonu
