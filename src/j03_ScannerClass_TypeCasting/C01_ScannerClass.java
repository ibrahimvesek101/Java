package j03_ScannerClass_TypeCasting;


import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {

        //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" etmek gerekir.
        //Scanner Class'i Java nin util kutuphanesindedir.

        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

        //  Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

        //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        //  System.out.print("adınızı giriniz :");

        //  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        //  String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        //  System.out.println("isim = " + isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...
        Scanner sc = new Scanner(System.in);//1. adım

        //  System.out.print("karenin kenarı giriniz : ");// 2. adım
        //  int kenar=sc.nextInt();//3. adım
        //  System.out.println("alan : "+(kenar*kenar)+" çevre :"+(kenar*4));
         /*
         Task->
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :
                 Output : Yilda 12.41 kg seker kullaniyorsunuz
         */
        // System.out.println("günlük içtiğniz çay sayısını giriniz :");//çay için 2 adım
        // int caySayisi=sc.nextInt();//çay için 3 adım


        // System.out.println("şeker sayinizi giriniz : "); // şeker için 2. adım
        // int seker=sc.nextInt();// seker için 3 adım

        // System.out.println("yıllık seker tüketiminiz : "+(caySayisi*seker*1.7*365)/1000+"kg");


        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);

        /*
        Task->
           Kullanicidan bir tamsayi girmesini isteyin ve sayiyi kendisinden bir kucuk
           sayi ve bir buyuk sayi ile carpip sonucu yazdirin

           Ornek Input  : 10
                Output : 990 (9*10*11)
         */
        // Task -> Kullanıcının adı ve soyadını print eden  bir code create ediniz...
        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...
        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...
        // Task -> Kullanıcının girdiği değere göre sayının küpünün yarısını hesaplayan bir code create ediniz...
    }
}
