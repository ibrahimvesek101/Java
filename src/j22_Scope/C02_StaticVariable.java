package j22_Scope;
public class C02_StaticVariable {//Class level
    /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

     */
    static String firmaIsim = "Clarusway";//initial edilmiş static variable->günes
    static int firmaId;//initial edilmemiş static variable->günes
    static boolean firmaIt;//initial edilmemiş static variable->günes

    public static void main(String[] args) {//main level

        System.out.println("firmaIt = " + firmaIt);
        firmaIt = true;//static variable doğrudan call edilip value atandı->best practice

        C02_StaticVariable.firmaId = 2021;//class name ile static variable call edilip value atandı->bad practice
        staticMethod();//static meth static blok'a doğrudan call edildi->galaxy ler arası astral seyahat
        // non_staticMethod();//non_static meth static blok'a doğrudan call edilemez sefil dunyalı doğrudan galaxye çıkamaz'

    }//main sonu

    public static void staticMethod() {//static method->galaxy
        System.out.println("value ataması öncesi call edilen fiemaId : " + firmaId);
        firmaId = 2023;//initial edilmemiş static variable static blok'a doğrudan call edilip value atandı
        System.out.println("value ataması sonrası call edilen fiemaId : " + firmaId);

    }

    public void non_staticMethod() {//non_static method->sefil dunyalı
        System.out.println("non_static blok call update öncesi firmaIsim = " + firmaIsim);
        firmaIsim = "offer'e en ksa yol CLARUSWAY :)";//initial edilmiş static variable non_static blok'a doğrudan call edilip update edildi'"
        System.out.println("non_static blok call update sorası firmaIsim = " + firmaIsim);
        staticMethod();//static meth non_static blok'a doğrudan call edilir
    }
}//Class sonu
