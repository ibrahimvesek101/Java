package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {
        String name = "Haluk";
        int yas = 33;
 /*
            Note: Java primitive lere method'lar ekleyerek yeni bir
                  yapi olusturdu, bu yapiya "Wrapper Class"
                  Primitive         Wrapper
                     byte     ==>    Byte
                     short    ==>    Short
                     ** int   ==>    Integer
                     long     ==>    Long
                     float    ==>    Float
                     double   ==>    Double
                     boolean  ==>    Boolean
                     ** char  ==>    Character
         */
        System.out.println(name.toUpperCase());//HALUK

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        //TASK id ve tc String değerlernin toplamını print eden code create ediniz.
        String tc = "1234455";//primitive data
        String id = "98765";
        System.out.println(tc + id);//concat-> birleştirme : 123445598765

        int yeniTC = Integer.valueOf(tc);// tc String değerini int cevirdi ve yeniTC'ye atadı
        System.out.println("yeniTC = " + yeniTC);

        int yeniId = Integer.valueOf(id);// tc String değerini int cevirdi ve yeniId'ye atadı
        System.out.println("yeniId = " + yeniId);

        System.out.println(yeniId + yeniTC);// aritmetik toplama->1333220
        String okulNo = "234543A";
        //int yeniOkulNo= Integer.valueOf(okulNo);// run time Exception-> çalışma zamanı hatası
        //System.out.println("yeniOkulNo = " + yeniOkulNo);
        System.out.println("madem geldin dünyaya otur çalış javaya");// 43. satır run time hayası verirse bu print çalışmaz


        Double sayi3 = 15.2;// Wrapper class obj data
        // System.out.println(sayi3.shortValue());
        // sayi3 wrapper Class olan Double class'ile create edildiği için
        // sayi3. ile Double class'a ait bir çok method kullanılabilir.

        short sayi1 = 20; // primitive data
        Short sayi4 = 30; // Wrapper  Short class obj. data


        // TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız

        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5

    }
}
