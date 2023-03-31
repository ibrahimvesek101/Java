package j10_MethodCreation.Tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task28 {
    /*
    task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

    randomNum(Integer.MAX_VALUE);

    }

    private static int randomNum(int sayi) {

        Random random = new Random();
        int sonuc = random.nextInt(sayi);
        return sonuc;
    }
}