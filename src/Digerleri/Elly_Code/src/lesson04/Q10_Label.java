package Digerleri.Elly_Code.src.lesson04;

public class Q10_Label {
    public static void main(String[] args) {
        // break ve continue sadece içinde bulunduğu döngüyü etkiler.

        // iç içe döngülerde , içteki bir değişkenin değerine göre dış döngüyü kırmak için
        // (continue da olabilir)  döngülere isim (etiket yani label) verilir.
        // ve break veya continue çalıştırılırken bu isim yazılarak istenilern döngü için
        // etki (break ve continue) oluşturulur.

        outer_loop : for(int i=1; i< 10; i++)  // outer_loop diye isim yani LABEL verilir.

                        for (int j=1; j<10 ;j++) {
                                if (j==3) break outer_loop;
                                // madem öyle eğer gerekirse içerideki döngüden dışardaki döngüyü nasıl kırarım ?

                                System.out.println("i="+i+", j="+j);
                            }

                        System.out.println();



        outer_loop : for(int i=1; i< 10; i++)
        {
            for (int j=1; j<10 ;j++) {
                if (j==3) continue outer_loop;

                System.out.println("i="+i+", j="+j);
            }

            System.out.println();
        }


    }

}
