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

        System.out.println("\n*** task01***");
        printCiftKareMaxEleman(sayiList);
        System.out.println("\n*** task02***");

        System.out.println("\n*** task03***");

        System.out.println("\n*** task04***");


    }//main

    // Task01-> list in çift elemanlarının en buyuğunu print eden code create ediiniz.

    public static void printCiftKareMaxEleman(List<Integer> sayiList) {
        Optional<Double> maxSayi = sayiList
                .stream()
                .filter(C01_LambdaExpression::ciftMi)
                .map(t -> Math.pow(t, 2))
                .reduce(Math::max);


    }

}