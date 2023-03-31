package j02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {

        /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */
            /*
        1)Java'da iki turlu "memory" var
            i)Stack Memory:
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory:
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
         Stack Memory'ye koyar. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" vardir.
     */
        /*
        PRIMITIVE DATA TYPELARI ILE NON-PRIMITIVE  DATA TYPE'LARI ARASINDAKI FARKLAR NELERDIR?
        1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk
        2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
        ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
        3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
        4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
        non-primitive'lerde ise degeri ve methodlari vardir.
        5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir
     */

        // TRICK --> Bir variable’a değer ataması yapılırken data type uygun değer atanmalıdır değilse JAVA derleme hatası CTE verir.
        // String bootcamp = "Clarusway";
        // String instructor = Haluk;
        // double maas="33000";
        // int yas=false;
        // String  ortalama=30000;

        String name = "özgür";
        String yas = "13";
        int age = 34;
        int yil = 22;
        boolean emekliMi = true;
        boolean ıtci = false;

        char ch1 = '$';
        char hrfA = 'A';
        char hrfa = 'a';
        char ch2 = ' '; //space(boşluk) bir character'dir ve char olarak kullanilabilir.
        //char ch3 = '';  char olustururken tek tirnak arasinda mutlaka bir character olmalidir.
        //Sifir character veya birden fazla character kabul edilmez.
        System.out.println(ch1);//$
        System.out.println(hrfA + ch2);//63 + 97 = 160
        //Buyuk harflerin ASCII degerleri kucuk harflerden kucuktur.American Standard Code for Information Interchange
        //Herhangi bir char'in ASCII degerini kod yazarak bulmak.


        //TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız...
        int dTarihi = 1999;
        int buYil = 2022;
        int yasınız = buYil - dTarihi;
        System.out.println(yasınız);

        float f1 = 12.45f;
        float f2 = 23.56F;
        double boy = 1.85;
        System.out.println(f1 * f2); // 12.45* 23.56 =293.322

        //Task -> iki farklı byte tanımlayıp toplam farkını print ediniz
        //byte a=23,b=44;
        byte a = 23;
        byte b = 44;
        System.out.println(a + b);//67
        System.out.println(a - b);//-11

        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam farkını print ediniz
        int c = 1453;
        byte d = 34;
        System.out.println(c+d);// 1487

        //Task -> tamsayı ve ondalıklı sayı tanımlayıp toplam  print ediniz
        int n=33;
        double m=14.53;
        System.out.println(n+m); //47.53--> 33.0+14.53

        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz
        int sayi=63;
        char para='$';
        System.out.println(sayi+para);//63+36=99--> $ ascii değeri 36 olarak aritmetik işleme girdi

        // Task ad ve soyadınızı ve yasınızı print ediniz.
        String ad="Haluk";
        String soyad="Bilgin";
        int yasın=48;

        System.out.println(ad+" "+soyad+" "+yasın);



    }
}
