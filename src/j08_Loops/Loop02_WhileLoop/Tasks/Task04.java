package j08_Loops.Loop02_WhileLoop.Tasks;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten
		kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */


        int basla = 1000;
        int sayac = 0;

        while (basla > 100) {

            if (basla % 12 == 0) {
                System.out.println(basla + " ");
                sayac++;

            }

            basla--;

        }
        System.out.println("Toplam " + sayac + " tane sayı vardır.");

    }

}
