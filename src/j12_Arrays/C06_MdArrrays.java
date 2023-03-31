package j12_Arrays;

import java.util.Arrays;

public class C06_MdArrrays {
    public static void main(String[] args) {
         /*
		Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
         Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
         formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
         matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
         satır ve sütun sayısını girmemiz yeterli olacaktır.
        * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

		 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
		 *  icerdeki  array'lere  inner->Daire array denir
		 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
		 *  Array'i ancak tum elemenlari atanarak declare edilmeli
		 * 3- Multi dimensional array'de bir elemanin indexi icin
		 *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */

        //MdArray declarations...
        int arr1[][] = new int[3][5];//-> 3 kat 5 daire depolayan bir boş MdArray tanımlandı:3 satır 5 sutun boş tablo
        //bir sitede 12 dairelik 7Şer katlı 5 apt nasıl MdArray olarak tanımlanır..
        int arr2[][][] = new int[5][7][12];

        //MdArray'e eleman ekleme
        arr1[2][3] = 43;//->2.kat 3. daire 43 atandı
        arr2[3][2][1] = 31;
        System.out.println(arr2[3][2][1]);//31
        System.out.println(arr2[3][2][3]);// atma yapılmayan eleman için default değer atanır:0
        System.out.println(arr1[2][3]);//43

        //MdArray tum eleman girilerek tanımlama
        int arr3[][]={
                {3,5},//0. kat
                {12,13,15},//1. kat
                {103,107,111,121},//2. kat
        };
        //MdArray print etme..
        System.out.println("arr1 = " + arr1);//ref değer alınır->herbir arr1 elemanı bir array
        System.out.println("arr2 = " + arr2);//ref değer alınır->herbir arr1 elemanı bir array
        System.out.println("Arrays.deepToString(arr1 ) = " + Arrays.deepToString(arr1));//arr1 apt tum daireler print
        System.out.println("Arrays.deepToString(arr2 ) = " + Arrays.deepToString(arr2));
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));//arr1 apt dairelerin ref
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3[2]));//[103, 107, 111, 121]-> arr3 apt 2. katındaki dairelir print

        /*
        MdArray  print etmek için..
        toString method kullanılırsa herbir iç(inner) array'in ref değeri print eder
        toString method dış(outer) arrayı Stringe cevirir.
        dış(outer) arrayı elemanları print etmek için deepToString method kullanılmalı
         */

        // MdArray istenen eleman print etme
        int yas[]={1,2,3,4,5,6,7,8,9};
        System.out.println("yas[2] = " + yas[2]);//3

        System.out.println("arr3[2][1] = " + arr3[2][1]);//107-> index doğrudan inner iç array elemana ulaşır
        System.out.println("arr3[2] = " + arr3[2]);//ref-> index doğrudan inner iç array ref ulaşır
        //MdArray istenen eleman print etme için istenen elamanın tum index değerleri (dış iç array index) girilmeli

    }
}
