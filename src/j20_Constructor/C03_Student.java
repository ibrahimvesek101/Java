package j20_Constructor;

public class C03_Student {// class level->vagon obj için aktif-pasif özellik bulunduran main siz class

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi +
                '}';
    }

    /*
        Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
        mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
         */
    //fields...
    String ad;
    String soyAd;
    int sınıf=58;
    double ortalama;
    int okulNo;
    boolean takdirBelgesi;

        //  @Override
        //  public String toString() {
        //      return
        //              "ad='" + ad + '\'' +
        //              ", soyAd='" + soyAd + '\'' +
        //              ", sınıf=" + sınıf +
        //              ", ortalama=" + ortalama +
        //              ", okulNo=" + okulNo +
        //              ", takdirBelgesi=" + takdirBelgesi ;
        //  }

        // public static void main(String[] args) {//main level

        //  C03_Student ogrc1=new C03_Student();
        //  ogrc1.ad="Vedat";
        //  ogrc1.soyAd="offer";
        //  ogrc1.okulNo=1453;
        //  ogrc1.sınıf=1;
        //  ogrc1.ortalama=70;
        //  ogrc1.takdirBelgesi=false;
        //  ogrc1.mezuniyet(ogrc1.ortalama);
        //  ogrc1.sosyalFaaliyet();
        //  System.out.println(ogrc1);//

        //  C03_Student ogrc2=new C03_Student();
        //  ogrc2.ad="Ceren";
        //  ogrc2.soyAd="Team Lead";
        //  ogrc2.okulNo=1905;
        //  ogrc2.sınıf=1;
        //  ogrc2.ortalama=81;
        //  ogrc2.takdirBelgesi=true;
        //  ogrc2.mezuniyet(ogrc2.ortalama);
        //  ogrc2.sosyalFaaliyet();
        //  System.out.println(ogrc2);//


        // }//main sonu


    public void mezuniyet(double ortalama) {
        if (ortalama>=50) {
            System.out.println("Agam diploma anca küşleme ile ıslatılır :)");
        }else {
            System.out.println("Agam bo ortalam ile NAHsıl mezun olirsen :( seneye de DEWAMKEEEE");
        }
    }public void sosyalFaaliyet() {
        System.out.println("Agam seni anca mangal basında sosyal gröüyoruz  :)");
    }

}
