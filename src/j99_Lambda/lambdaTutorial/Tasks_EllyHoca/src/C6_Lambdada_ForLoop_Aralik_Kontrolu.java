package j99_Lambda.lambdaTutorial.Tasks_EllyHoca.src;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {


    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)


    // S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)


    // S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim **rangeClosed(a,b)


    // S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim **average()


    // S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?  **rangeClosed(a,b)   filter()  count()- long


    // S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim **rangeClosed(a,b)   filter()  forEach()


    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim  **rangeClosed(a,b)   filter() sum()


    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim **rangeClosed(a,b)   Methods::tekMi   reduce(1, carpim)


    // S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim  *** IntSteram    limit(10)  filter ()  forEach()


    // S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yazdiralim


    // S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim



}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz