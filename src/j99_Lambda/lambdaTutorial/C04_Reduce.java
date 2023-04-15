package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {
    public static void main(String[] args) {

    /*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

    */

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));

        System.out.println("*** task01***");
        printCiftKareMaxEleman(sayiList);
        System.out.println("\n*** task02***");
        elemanlarıToplamı(sayiList);

        System.out.println("\n*** task03***");
        ciftElemanlarıCarp(sayiList);

        System.out.println("\n*** task04***");
        enKckElPrint( sayiList);

        System.out.println("\n*** task05 ***");

        enKckTekEleman( sayiList);
    }//main

    // Task01-> list in çift elemanlarının en buyuğunu print eden code create ediiniz.

    public static void printCiftKareMaxEleman(List<Integer> sayiList) {
        Optional<Double> maxSayi = sayiList
                .stream()
                .filter(C01_LambdaExpression::ciftMi)
                .map(t -> Math.pow(t, 2))
                .reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi);
    }

    //  task02-> list elemanlarının toplamını prınt eden code create ediniz.

    public static void elemanlarıToplamı(List<Integer> sayiList){
        System.out.println(sayiList
                .stream()
                .reduce(Math::addExact));   //direk sout içine yazdırdık


        Optional<Integer> toplam= sayiList.stream().reduce(Integer::sum);
        System.out.println("toplam = " + toplam);

        sayiList.stream()
                .reduce(0,(a,b) ->a+b);

        /*

        a: ilk değerini her zaman  atanan identity değerden alır.
        b: değerini her zaman Stream()'den alır
        a: ilk değerden sonraki değerini action(işlem body)'den alır                                                                         */

    }
   // task03 -> list'in çift elemanlarının çarpımmını yazdırınız

    public static void ciftElemanlarıCarp(List<Integer> sayiList) {

      int çarpım=  sayiList.stream()
              .filter(C01_LambdaExpression::ciftMi)
                .reduce(1,(a,b) ->a*b);
        System.out.println(çarpım);

        //2.yol:
        Optional<Integer> çarpım1=  sayiList.stream()
                .filter(C01_LambdaExpression::ciftMi)
                .reduce(Math::multiplyExact);
        System.out.println(çarpım1);
    }

    //  Task04--> list elemanlarının en küçüğünü
    //  print eden code 4 farklı şek.create ediniz.

    public static void enKckElPrint(List<Integer> sayiList){
        System.out.println(sayiList.stream().reduce(Math::min));
        System.out.println(sayiList.stream().reduce(Integer::min));
        System.out.println(sayiList.stream().reduce(C04_Reduce::minElBul));
        System.out.println(sayiList.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));


    }
    public static int minElBul(int a, int b){

        return a<b?a:b;
    }

    // Task05-> List elemanlarının 58'den buyuk en kucuk
    // tek elemanı print eden code create ediniz...

    public static void enKckTekEleman(List<Integer> sayiList){
        System.out.println(sayiList.stream().filter(t -> t > 58 && t % 2 == 1).reduce(Integer::min));

       // System.out.println(sayiList.stream().filter(t -> t > 58 && C01_LambdaExpression::ciftMi).reduce(Integer::min));
        // CTE-> exp. ve method aynı parametrede kullanılamaz.
    }
}