package j19_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
           /*
   String = > daha yavas ,Immutable==> degismez,
   String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

   1) Java pass-by-value kullanir.dublor
   2) String Class'i immutable Class'dir.değişmez

    StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
    StringBuffer synchronized,thread safe.

   StringBuilders = mutable==>degisebilir ,
   not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

   1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
   StringBuilder isimli bir class uretmistir.
   2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
   "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
   "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
   "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
   3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
  	Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

				 */
        String name="";
        name+="QA tester ";
        name+="Ali bey"; // String variable çok fazla meth. call  için performansı zayıftır->yavaş
        /*
         Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olan StringBuilder kullanılır.
        yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.O zaman StringBuffer kullanılır.
        StringBuilder; Dolmus söföru gibi geleni aliyor
        StringBuffer de TAKSİ ler gibi çalışır
         */
        System.out.println("method öncesi name = " + name);//QA tester Ali bey

       strBirlestir(name);//name makyaja dubloru gitti->QA tester Ali bey method call başarılı çalıştı dewamkee

        System.out.println("method sonrası  name = " + name);//QA tester Ali bey->immutable

        // task-> 3333 tekrarlı loop ile String variable ve StringBuilder obj run time surelerini karşılaştıran code create ediniz
      String str="";
      StringBuilder sb=new StringBuilder("");

        System.out.println("  ***  str loop   ***  ");

        LocalTime strBaslangic = LocalTime.now();//str başlama zamanı
        for (int i = 1; i <=3333 ; i++) {//3333 tekrarlı str loop
            str+=i;
        }

        LocalTime strBitis = LocalTime.now();//str bitiş zamanı
        System.out.println("String hızı : "+(strBitis.getNano()-strBaslangic.getNano()));
        System.out.println("  ***   sb loop   ***  ");
        LocalTime sbBaslangic = LocalTime.now();//sb başlama zamanı
        for (int i = 1; i <=3333 ; i++) {//3333 tekrarlı sb loop
            sb.append(i);
        }

        LocalTime sbBitis = LocalTime.now();//sb bitiş zamanı
        System.out.println("StringBuilder hızı : "+(sbBitis.getNano()-sbBaslangic.getNano()));


    }//main sonu

    private static void strBirlestir(String name) {

        System.out.println(name +" method call başarılı çalıştı dewamkee ");
    }


}//class sonu
