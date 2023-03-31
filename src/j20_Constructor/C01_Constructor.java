package j20_Constructor;

public class C01_Constructor {//class bası-> class level

    //fields-> obj alabileceği variable'lar
    String str;//clas level'da create edilen initial edilmemiş instance(obj) variable;
    String selam = "selam javaCAN";//clas level'da create edilen initial edilmiş instance(obj) variable
    //  C01_Constructor obj1 = new C01_Constructor();//p'six defult cons. ile obj1 create edildi class level'da

    public static void main(String[] args) {//main bası-> main meth level
        String maindekiVariable = "java";//main meth level daki variable
         /*
    1- consturctor ismi Calss name ile aynı olmalı.Cons name Buyuk harf ile başlamalı
    2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
    3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
    4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
    5- Class tanımlandığında java default(p'siz) cons. kendi create eder.
    6-Fields-> obj'nin uretilirken alacagı değer variables
    7-bir class'da bir den çok cons. tanımlanabilir.

     */

        // ClassName(obj Data Type)       objName   = new      Constructor
        C01_Constructor obj1 = new C01_Constructor();//p'six defult cons. ile obj1 create edildi
        // C01_Constructor                 obj1     = new     C01_Constructor();// aynı scop içinde 1 den fazla aynı obj tanımlanamz
        C01_Constructor obj2 = new C01_Constructor();//p'six defult cons. ile obj2 create edildi
        C01_Constructor obj3 = new C01_Constructor();//p'six defult cons. ile obj3 create edildi

        obj1.selam = "selam JavaTAR :)";//obj1 ile ins. variable call edilerek selam JavaTAR :) value atandı
        obj2.selam = "sefil HalUk'a bol samırsaklı  atom kelle-paça çeeekkk";

        // selam -> class leveldeki bir variable obj olamadan call edilemez
        System.out.println("maindekiVariable = " + maindekiVariable);

        System.out.println("obj1.selam = " + obj1.selam);// selam JavaTAR :)
        System.out.println("obj2.selam = " + obj2.selam);// sefil HalUk'a bol samırsaklı  atom kelle-paça çeeekkk
        System.out.println("obj1.str = " + obj1.str);// null
        System.out.println("obj1.str = " + obj2.str);// null
        System.out.println("obj3.selam = " + obj3.selam);// selam javaCAN

        obj2.str = "taha beyyyy";
        System.out.println("obj2.str = " + obj2.str);// taha beyyyy
        obj1.agamaSelam();//obj1 üzerinden non-static meth call edildi->agama bolcana selamkeee :)
        obj2.agamaSelam();//obj1 üzerinden non-static meth call edildi->agama bolcana selamkeee :)
        obj3.agamaSelam();//obj1 üzerinden non-static meth call edildi->agama bolcana selamkeee :)
        // agamaSelam();-> non-satic meth obj olmadan call edilemez

    }//main sonu

    private  void agamaSelam() {// non-stati cvoid return p'siz meth. class level
        System.out.println("agama bolcana selamkeee :)");
    }

}//class sonu