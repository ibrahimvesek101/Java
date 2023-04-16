package j01_Variables;

public class HelloWorld {
    /*
        PROJE OLUSTURMA===>File==>New==>Project==>Next==>Name(Buraya projenin ismini yaz kucuk harfle basla javaPractice103104105)==>finish
        PACKAGE OLUSTURMA==>java dosyasina sag click==>New==>Package==>istedigin ismi yaz kucuk harfle basla( day01_variables )
        CLASS OLUSTURMA==>olusturdugun package uzerine sag click==>New==Class==> istedigin ismi yaz buyuk harfle basla ( C01_Variables )
     */
    public static void main(String[] args) { //main method -> arabanın motoru gibidir :) icinde kullanacaginiz hersey "static" olmalidir.
        // System.out.println("merhaba dünya");// bu komut konsala yazılan metni print eder

        // (single-line comment) //dan sonra  yazılan ifadeler komut veya kod satırı olraka değil yorum olarak tanımlanır.

        /* çoklu satır yorum(multi-line comment)..
       bu araya yazılan her ifade yorum satırı olur java kod olarak derlemez
       başarı gayrete aşıktır
       bahanesi olanın başarısı olmaz
        */

        /*
        bu gibi şöyle yapılır haluk hoca dediki madem geldin dünyaya otur çalış javaya
         */

        //imleçin oldugu satır ctrl+d cmd+d ile alt satıra kopyalanır

        /*
        Java run edildiğinde çalışmaya ilk önce main method'dan başlar
        daha sonra yukarıdan aşağıya ve soldan sağa soğru sırasıyla code'ları çalıştırır
         */

        /*
     TRICK -> javada code satırı cümle(statement) sonuna mutlaka  ; koyulmalı
     code satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
     CTE düzeltilmeden(handle) code yazılmaz yazılan code çalışmaz
    */

        // System.out.println("hata");

//TASK:  ad soyad yas memleket ve meslek print ediniz(console yazdırınız)
        System.out.print("adım soyadım : haluk bilgin");//cumle sonuna mutlaka noktali virgul koyulmali
        System.out.println(" yaşım : 48");
        System.out.println("memeleketim denizli");
        System.out.println("mesleğim  : java developer");

        /*
        TRICK ->
        print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println-> yazdırma işleminden sonraki komutu ALT satırda devam ettirir.
        javada space "boşluk" bir character olarak tanımlanır
        h a l u k->9 karakter
         */
        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
        //Ekrana bir sey yazdirmak icin iki tane kod var
        // i)System.out.println() ==> Satirbasi yapar
        // ii)System.out.print() ==> Satirbasi yapmaz
    }
//merhaba-> herhangi bir satıra main içi-dışı class içi-dışı farketmez yorum yazılabilir

}
// selam -> class dışına yorum yazıldı