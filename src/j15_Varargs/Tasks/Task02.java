package j15_Varargs.Tasks;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

         */
        //   int sayiArr[] = {2,24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println("2,24, 23, 38, 33, 21, 59, 26, 10 sayıların ilki ile kalanların toplam carpımı : " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));// 468

    }//main sonu

    public static int toplaCarp(int carpacakSayi, int... toplancakSayılar) {//2 int p'li ancak 2. p varargs olan method

        int toplam = 0;//toplancak sayılar için boş kutu tanımlandı
        for (int a : toplancakSayılar) {
            toplam += a;
        }

        return carpacakSayi * toplam;
    }
}