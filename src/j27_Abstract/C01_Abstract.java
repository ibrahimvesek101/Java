package j27_Abstract;

public class C01_Abstract {
/*
1- App obj için gereken durumlarda child class'lar parent class'daki method'ların genellikle body'lerine değiştirerek override ederler.
Bu gibi durumlarda parent class'daki method'a body tanımlamak ram ve memory acısından gereksizdir.
Çözüm olarak java Parent Class'a body'siz -> abstract(soyut)  methodlar tanımlamıştır.

2- Parent class'daki abstract methodlar app güvenliği açısından child class'da override edilmek zorundadır.
eğer parent class'daki child class'ın mutlaka kullanması gereken method varsa abstract tanımlanmalı
motor() her aracda olmalı.

3- abstract method tanımlamak  için
  a) {} body taımlanmaz->meleklerin fiziki vucudu olmaz.
  b) access modifier  sonrası abstract keyword kullanılmalı->public abstract class Honda {}
  c) abs method içinde abstract keyword ve {} body birarada kullanılamaz aksi halde CTE fırlatır.
  abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.
4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.->fani dunyalı vuucudu görünmex soyut olamaz
        ama abs class'da concerete emthod tanımlanabilir.->melekler isterse dunyalıya fiziken görünebilir.
5- Abs Class içinde hem abs method hem de concrete method ve variable tanımlanabilir.
6- Bir concerete child class parent abs class extend ettiğnde abs method'ları implement etmek zorundadır
    ama concerete methodlar isteğe göre override edilir.
7- Parent-child ilşkisi olan abstract class'lar abs method'ları implement etmek zorunda değildir.
8- Parent olan abs class birden çok concerete  veya abs child class extends edilebilir.
    ancak child class birden cok abs parent class'dan extends e-de-mezz...

9-  Abs Class'da final ve abs method tanımlanamaz CTE -> final method override edilemeyecegi için abs olamaz
10- Abs Class'da private ve abs method tanımlanamaz CTE -> private method override edilemeyecegi için abs olamaz
11- Abs Class'da static ve abs method tanımlanamaz CTE-> static method override edilemyeecegi için abs olamaz

    **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE URETEMEZ !!!!
    TRİCK-> Abstract Class'lar referansı alıp  child Class'ın obj tutabilir(Polimorphism)
 */

}
