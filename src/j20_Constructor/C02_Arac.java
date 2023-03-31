package j20_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km;
    double motorHacmi;

    boolean vitesAuto;

    boolean ikinciEl;
    int yil;



    public static void main(String[] args) {
// Task-> fields: marka, model, km, motorHacim, vitesAuto,ikinciEl, yıl olan
// 3 tane obj create ederek fields print eden code create ediniz'

  C02_Arac arac1=new C02_Arac();
  arac1.marka="Volvo";
  arac1.model="s80";
  arac1.km=95000;
  arac1.vitesAuto=true;
  arac1.ikinciEl=true;
  arac1.motorHacmi=2.0;
  arac1.yil=2015;
        System.out.println("arac1 = " + arac1);


        System.out.println(arac1.marka+ " , " +arac1.model+ " , "+arac1.km+ " , "
                +arac1.vitesAuto+ " , "+arac1.ikinciEl+ " , "+arac1.motorHacmi+ " , "+arac1.yil);



        C02_Arac arac2=new C02_Arac();

  arac2.marka="tosbaaa";
  arac2.model="bidıls";
  arac2.km=9999;
  arac2.vitesAuto=false;
  arac2.ikinciEl=true;
  arac2.motorHacmi=1.5;
  arac2.yil=1990;

        System.out.println("arac2 = " + arac2);


        C02_Arac arac3=new C02_Arac();
  arac3.marka="Mercedes";
  arac3.model="a220";
  arac3.km=10000;
  arac3.vitesAuto=true;
  arac3.ikinciEl=true;
  arac3.motorHacmi=2.0;
  arac3.yil=2022;

        System.out.println("arac3 = " + arac3);

    }
    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                '}';
    }

}
