package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        /*Variable
          bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
          Variable icinde deger saklayan bir konteynirdir
        bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
        örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
        geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
        kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
         */

        // variable create(Değişken oluşturmak) için..
        // 1- DataType(Değişken türü) VariableName(Değişken ismi) "=" value(değişken değeri) ";"
        //             int                  yas                    =  48  ;
        //                Declaration(Tanımlama)                   =  Assaignment(Atama)
        //Variable nasil olusturulur?

        //1)Access Modifier   2)Data Type     3)Variable ismi     4) =       5)Deger    6);

        // Java'da ";" Ingilizce'deki "." gibidir
        // Ingilizce'de "cumle" deriz, Java'da "statement" deriz

        // "=" sembolu "Assignment(Atama) Operator" olarak adlandirilir
        // "Assignment(Atama) Operator" sagdaki degeri alir soldaki variable'in icine koyar

        // 1. yol -> best practice(Recomended) tavsiye edilen
        int yas=48;//cumle sonuna mutlaka noktali virgul ; koyulmali
        int maas=33000;
        System.out.println("yas");//yas
        System.out.println(yas);//48
        System.out.println(maas);//33000;
        System.out.println("nur hanım başlangıç maaşı : "+maas);//nur hanım başlanıç maaşı : 33000
        // 2. yol
        int boy ; // değeri atanmayan boy isiminde bir int tanımlandı declaration
      //  System.out.println(boy);// değeri atnamamış değişkeni hiç bir aksiyonda kullanılamaz CTE
        boy=175; // variable value assaignment -> değişkene değer ataması yapıldı
        System.out.println("boyunuz:" +boy);//175


        // 3. yol
        int yevmiye,age,kilo;// birden cok aynı tipte değişken tek tanımlama ile declare edilebilir..
        age=33;
        yevmiye=1000;
        kilo=99;// tanımlanan değişkenlere değer ataması yapıldı..

        int gunluk=1500, yil=2022, agırlık=99;
                //TRICK -> bir variable sadece bir kez tanımlanabilir ama birden cok istenildiği kadar  değer atanabilir.
        System.out.println(gunluk);//1500

        gunluk=1800;// gunluk yeni  değeri 1800 olarak atandı
        System.out.println("gunluk son değeri :"+gunluk);//1800
        System.out.println("gunluk değeri:"+gunluk+"yıl değeri: "+yil+" "+yas+yevmiye+agırlık);
        /*
       CISS :(  variable declare edildikten sonra tekrar declare EDİLMEZZZ ->CTE
         */
        // int age;// -> dublicate variable declaration CTE
    }
}
