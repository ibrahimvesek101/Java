package j22_Scope;

public class C01_InstanceVariable {//Class level

    /*												INSTANCE VARIABLE

     1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
         olusturulan variable'lara non-Static Class level "instance variable" denir.
     2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
     3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
         Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
         Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
             "yas" variable'i initialize edildi, digerleri initialize edilmedi.
     4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
                 byte, short, int, long icin default value 0'dir.
                 float, double --> default value 0.0'dir.
                 char --> default value ' ''dir.
                 boolean --> default value false'dur.
                 String --> default value "null" dir.

 */
    static String kurs = "clarusway";//initial edilmiş static güneş variable
    static String prLanguage;//initial edilmemiş static güneş variable
    //fields..-> inst. variable

    int yas = 48;//initialize variable
    int tecrube;//default value:0
    String name; //default value: "null"
    boolean developerMi;//default value: false
    double boy; //default value: 0.0
    char unvan; //default value: ' 'dir.

    public static void main(String[] args) { //main level
        // static int a=17; //local variable-> static blokda static variable tanımlanamaz
        int a = 17;//initial edilmiş local variable
        System.out.println("a = " + a);//17
        int b;//intial edilmemiş localvariable
        // System.out.println("b = " + b);//inital edilmeyen variable localde action alamaz..
        b = 63;//value ataması yapıldı
        System.out.println("local variable b doğrudan call  = " + b);//value atamsı yapılan variable action alır
        // System.out.println("yas = " + yas);//initial edilmemiş inst. variable obj olmadan dogrudan call edilemez
        System.out.println("static variable kurs doğrudan call = " + kurs);//initial edilmiş static variable static blok'a doğrudan call edilebilir->Astral seyahat galaxiler arsdsı

        System.out.println("static variable prLanguage doğrudan call  = " + prLanguage);//initial edilmemiş static variable static blok'a doğrudan cal edilebilir
        static_method(); //static method doğrudan call edildi->astral galaxi seyahat
        //non_static_method();//static blok'a non sttatic method doğrudan call edilemez

        C01_InstanceVariable obj = new C01_InstanceVariable();//obj create edildi
        obj.non_static_method();//non static method doğrudan call edilemez ancak obj(sefil dunyalı galaxiye mekikle çıkar) ile call edilir
        System.out.println("obj.developerMi = " + obj.developerMi);//non-static inst. variable static blok'a doğrudan call edilemez
        // ancak obj ile call edilebilir

    }//main sonu

    public void non_static_method() {//non_static_method->sefil dunyalı
        System.out.println("Agam'a non-static methoddan selamkeee :)");
    }

    public static void static_method() {//static_method->galaxi'li
        System.out.println("Agam'a static methoddan selamkeee :)");
    }
}//Class sonu