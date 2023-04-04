package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_LambdaExpression {
    /*
	 	1) Lambda "Functional Programming"-->mathod(action) kullanan pr dili.
	 	   Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
	       Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
	 	   Lambda’lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
	   	   Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

	 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	     	ve hatasiz code yazma acilarindan cok avantajlıdır(Çoooğ iyi ...  :) ).
	 	4) Lambda sadece collections'larda(List, Queue ve Set) ve Array'lerde kullanilabilir ancak map'lerde kullanılmaz.
           Lambda kullanmak hatasız code kullanmaktır.

                "Functional Programming"--> CINCIX Programming
                "Structured Programming"--> AMELE Programming

            Collections Nedir?
            Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
            yapar. Array’ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
            yaptığı gibi, daha fazlasını da yapar.
            Java’da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
            topluluğu bir arada tutan bir yapıdır. ‘Collections Framework’ ise arayüzler ve onların kurgularından
            (implementations) oluşur.

             API:Uygulama programlama arayüzü
             (İngilizce: Application Programming Interface, kısaca API), bir yazılımın başka bir yazılımda tanımlanmış işlevlerini
             kullanabilmesi için oluşturulmuş bir tanım bütünüdür.
             API, yazılım bileşeniyle olan etkileşimlerin bir özelliğidir.
             Bu da örnek olarak şu anlama gelir. Bir arabanın bir yazılımı olduğunu hayal edin.
             Bu arabanın API'si arabanın neler yapabileceği hakkında bilgi içerir; hızlanma, frenleme, camları açma, vs.
             Ayrıca bunların nasıl yapabileceğine dair bilgiler de içerir.
             Örneğin hızlanmak için ayağınızı gaz pedalına koyup itersiniz.
             API, ayağınızı gaza bastığınızda motorun içinde neler olduğunu açıklamak zorunda değildir.
             Bu nedenle, içten yanmalı motorlu bir araba kullanmayı öğrendiyseniz, tamamen
             yeni bir dizi beceri öğrenmek zorunda kalmadan API sayesinde elektrikli bir arabayı rahatlıkla kullanabilirsiniz.

	 */
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));

        System.out.println("   task01   ");//58 7 54 41 59 33 38 13 65 61 46 45 25 16
        printElStructred(sayiList);
        System.out.println("\n   task02   ");
        printElfunctional(sayiList);//58 7 54 41 59 33 38 13 65 61 46 45 25 16
        System.out.println("\n   task03   ");
        printElfunctional1(sayiList);
        System.out.println("\n   task03   ");
        printElfunctional2(sayiList);


    }//main sonu
    //task 01->  "Structured Programming"--> AMELE Programming kullanara list elemanlarını aynı satırda aralarında bosluk olacak şekilde print ediniz.

    public static void printElStructred(List<Integer> sayiList) {
        for (Integer avuc : sayiList) {
            System.out.print(avuc + " ");
        }
    }
    //task 02->  "Functional Programming"--> CINCIX Programming kullanarak list elemanlarını aynı satırda aralarında bosluk olacak şekilde print ediniz.

    public static void printElfunctional(List<Integer> sayiList) {


        sayiList.//akısa girecek coll kaynagı call edildi
                stream().//coll dan gelen elemanlar akısa alındı
                forEach((t) -> System.out.print(t + " "));//akısdaki herbir eleman t'ye atandı ve herbir t elemanı sout meth call etti

    }

    /*
        stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
        forEach() :datanin parametresine gore her bir elemanı isler
        t-> : Lambda operatoru
         Lambda Expression-->(parameter list) -> {action body}
             Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
             -> Arrow-token: Argüman listesi(parameter list) ile expression gövdesini(action body) birbirine bağlamak için kullanılır.
             Body: Expressionları ve statementları içerir.

            Bir kod bloğundan oluşan bir body...
            Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
            Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

                () -> {
                 double pi = 3.1415;
                    return pi;
                };
       ahanda trick köşeşinde bugun :   Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

        */
    public static void printElfunctional1(List<Integer> sayiList) {


        sayiList.//akısa girecek coll kaynagı call edildi
                stream().//coll dan gelen elemanlar akısa alındı
                forEach(System.out::print);//akısdaki herbir elemanprint meth refere ediler yazdırlıldı.

        //  me

    }
    public static void printElfunctional2(List<Integer> sayiList) {


        sayiList.//akısa girecek coll kaynagı call edildi
                stream().//coll dan gelen elemanlar akısa alındı
                forEach(C01_LambdaExpression::yazdirInt);//akısdaki herbir elemanprint meth refere ediler yazdırlıldı.

    }
    public static void yazdirInt(int a){//normal Allah'ın  methodu-> int olan parametreyi yan yana boslukla print ediyor
        //seed ->tohum çekirdek method:refere edilecek meth

        System.out.print(a+" ");
    }

    public static boolean ciftMi(int x){
        return x%2==0;
    }


    public static void yazdirStr(String a){//normal Allah'ın  methodu-> int olan parametreyi yan yana boslukla print ediyor
        //seed ->tohum çekirdek method:refere edilecek meth

        System.out.print(a+" ");
    }
}