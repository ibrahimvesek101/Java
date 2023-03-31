package j08_Loops.Loop01_FoorLoop;

public class C03_NestedLoop {
    public static void main(String[] args) {

        /*
Bir loop body'de {loop}  farklı brloop tanımlanmasıyla oluşan code blok'a nestedd lopp denir.-> apt. daire döngüsü
iç loop dış  loop'un her step'inde tekrar çalışır.en içteki lopp bitmeden dış lopp bitmez. ilk önce en içdeki lopp run olur
 */

        for (int apt  = 1; apt <= 5; apt++) {


            for (int daire = 1; daire <= 3 ; daire++) {
                System.out.println("apt : "+ apt + "için daire :" + daire);
            }
        }
    }
}
