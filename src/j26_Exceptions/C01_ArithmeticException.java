package j26_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {//Class level

    public static void main(String[] args) {//main  meth. level
        // ArithmeticException-> matematiksei işlemlerde oluşat Run Time exception type'dır

        Scanner input = new Scanner(System.in);
        System.out.println("agam 1. sayıyı giresen : ");
        int sayi1 = input.nextInt();
        System.out.println("agam 2. sayıyı giresen : ");
        int sayi2 = input.nextInt();
        //int bolum=sayi1/sayi2;//ArithmeticException/ by zero
        // System.out.println("agam bölme işlenmi sonucu : "+(bolum));
        try {//dene-> hatanınn olma ihtimali oldugu blok->isitisnai durum
        /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE

             */
            int bolum = sayi1 / sayi2;
            System.out.println("agam bölme işlenmi sonucu : " + (bolum));
            System.out.println("Agam try blok'dan selamkeee");
        } catch (ArithmeticException e) {//try bşok'da denenen istisnai durum gerçekleşirse yapılacak blok
            System.out.println("Agam niddin sıfır böler mi hiç ?" + e.getMessage());
            System.out.println("Agam 1. catch blok'dan selamkeee");
        } catch (ArrayIndexOutOfBoundsException ebikgabık) {
            System.out.println("Agam niddin olmayan array elelmanı istirsen :( ");
            System.out.println("Agam 2. catch blok'dan selamkeee");
        } catch (
                Exception falanFilan) {//Exception Class g parent:Hz.ADEM: butun axception kapsayan exception class->bad practice
            //  System.out.println("falanFilan.getStackTrace() = " + falanFilan.getStackTrace());// tum exception açıklamanın ref değeri print eder
            falanFilan.printStackTrace();//// tum exception açıklamanın f değeri print eder
            System.out.println("Agam hz.ADEM catch blok'dan selamkeee");
        } finally {//ne yaparsan sonunda bunu yap blok -> catch bloklardan sonra mutlaka çalışması istenen action için tanımlanır.
        /*
            try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
            hata alınır ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hata olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */
            System.out.println("Agam finally blokdan selamkeee");
        }

        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");

    }//main sonu
}//Class sonu