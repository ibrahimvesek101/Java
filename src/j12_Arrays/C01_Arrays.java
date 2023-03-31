package j12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
        Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
        Array tanımlamak için:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden variable omalıdır.)
        2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

         Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */

        //Array declaration
        int a;//-> declare edilen ancak assaignment(atama) yapılmayan primitive variable
        int arr[];//-> declare edilen ancak assaignment(atama) yapılmayan int type array
        //Trick -> ataması yapılmayan bir array herhangir actiona alınamaz CTRE veririr.


        String isimArr[] = {"Yusuf", "Murat", "Ceren", "*Vedat", "**Suzan", "Abdi"};//declare ve assaignment edilmiş string type array
        int sayiArr[] = new int[5];//declare edilmiş length 5 girilmiş int type array

        // Array'a eleman ekleme- update etme
        sayiArr[1] = 25;//sayiArr 1. idex 25 value atandı
        sayiArr[0] = 46;//sayiArr 0. idex 46 value atandı
        sayiArr[2] = 31;//sayiArr 2. idex 31 value atandı
        sayiArr[1] = 2;//sayiArr 1. idex 2 value update-> array elemanları unique olmak zorunda değil tekrarlı eleman barındırabilir
        sayiArr[3] = 2;
        sayiArr[4] = 46;
        // Array eleman sayısı-> length boyut
        System.out.println("sayiArr.length = " + sayiArr.length);//5
        System.out.println("isimArr.length = " + isimArr.length);//6
        int kacİsim = isimArr.length;
        System.out.println("kacİsim = " + kacİsim);//6

        //Array son index eleman
        System.out.println("isimArr[son eleman] = " + isimArr[isimArr.length - 1]);//Abdi
        isimArr[isimArr.length - 1] = "son eleman bükücü Abdi";// array son eleman update edildi
        System.out.println("isimArr[son eleman] = " + isimArr[isimArr.length - 1]);//Abdi

        // Array eleman print etme...-> Array doğrudan sout komutu ile print edilirse ref. değerei verir
        //Arrays.toString(array); ile sout edilmeli

        System.out.println("isimArr = " + isimArr);//-> array non-primitive data oldg için stacde referans değer print eder :[Ljava.lang.String;@3d8c7aca
        System.out.println(Arrays.toString(isimArr));//[Yusuf, Murat, Ceren, Vedat, Suzan, son eleman bükücü Abdi]

        for (int i = 0; i < isimArr.length; i++) {//bad practice
            System.out.print(isimArr[i] + " ");//Yusuf Murat Ceren Vedat Suzan son eleman bükücü Abdi
        }
        System.out.println();//dumy

        //Task-> sayıArr cift index elemanlarını print eden code create ediniz
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        for (int i = 0; i < sayiArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(sayiArr[i] + " "); //46 31 46
            }
        }
        System.out.println();
        //Task-> isimArray de 5 karakterden fazla olan elemanı print eden code create ediniz

        for (int i = 0; i < isimArr.length; i++) {//array elemalarını index ile tekraralama yapar
            if (isimArr[i].length() > 5) {
                System.out.print(isimArr[i] + " ");
            }
        }
        //Task-> isimArray de 6 karakterden az olan elemanı saklayan arrayı print eden code create ediniz
        int yeniArrayBoyut = 0;


        for (int i = 0; i < isimArr.length; i++) {//array elemalarını index ile tekraralama yapar
            if (isimArr[i].length() < 6) {
                yeniArrayBoyut++;
            }
        }
        String yeniArr[] = new String[yeniArrayBoyut];//sartı sağlayan elamanlarda oluşan yeniArray
        int j = 0;//yeniArr indexi
        for (int i = 0; i < isimArr.length; i++) {

            if (isimArr[i].length() < 6) {
                yeniArr[j] = isimArr[i]; //sartı sağlayan eleman yeni arraya atandı
                j++;
            }
        }
        System.out.println(yeniArrayBoyut);
        System.out.println(Arrays.toString(yeniArr));//[Yusuf, Murat, Ceren]

        //array eleman sırlama...naturel:k->b , alafabetik
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));//[Yusuf, Murat, Ceren, *Vedat, **Suzan, son eleman bükücü Abdi]
        Arrays.sort(isimArr);//naturel sırlama yapıldı
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));// [**Suzan, *Vedat, Ceren, Murat, Yusuf, son eleman bükücü Abdi]

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));//[46, 2, 31, 2, 46]
        Arrays.sort(sayiArr);//naturel sırlama yapıldı
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));//[2, 2, 31, 46, 46]

    }
}
