package j10_MethodCreation;

public class C01_MethodCreation {//Class baslangıcı

        /*
           code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
           main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
           1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
           parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.
             str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                                 bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                                 bana rapor olarak ne getirdigini bilmem lazim (true/false)

           2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

           3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
              de oldugu gibi
              disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
              deklare edilmeli

              method call edildiğinde  Parametre olarak
              declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
       */


    public static void main(String[] args) {//main baslangıç

        topla();//method call
        topla1(23, 58);
        System.out.println(topla1(23, 58));//40
        System.out.println(topla1(12, 34));//23
        System.out.println(topla1(50, 38));//44
        System.out.println(topla1(27, 63));//45
        System.out.println(topla1(47, 53));//50
        System.out.println(topla1(41, 39));//40

        topla2(45, 1.5, "javaCAN");
    /*
    bir method main blok dışına create ediliri main blok'a call edilmezse method run olmaz
    best Practice-> method'lar main bloktan sonra create edilir.
     */
        System.out.println(topla3());//toplam : 54
    }//main sonu

    private static int topla1(int ebik, int gabık) {//iki int type p'li int return method


        return (ebik + gabık) / 2;//eyyy method sana verilecek iki int değeri topla ve 2'ye bolerek return et
    }

    private static void topla2(int sayi, double boy, String name) {//int, double, String type 3 p'li void method
        System.out.println(sayi + boy);
        System.out.println("agam hoş gelisin : " + name);

    }


    public static void topla() {//p'siz void method create edildi

        int a = 23;
        int b = 58;
        System.out.println(a + b);
        System.out.println("agam topla methodundan selam");

    }

    public static String topla3() {
        int a = 23;
        int b = 31;

        return "toplam : "+(a + b);
    }


}//Class sonu