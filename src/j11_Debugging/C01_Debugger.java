package j11_Debugging;

public class C01_Debugger {
    /*
 Debug yapiyorsan, kodu anlamadin demektir.
 Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
 Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
 Debug etmek kodun mental bir modelinin eksikligine isarettir...

 İki durumda debugger gerekli olabilir:
 *  Mevcut kod devralındığında.
 *  Yeni kod yazıldığında.
 her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
 Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
 */
    static int ebikGabık = 17;//gökdeki güneş her methoda erişebilir

    public static void main(String[] args) {
        method01();//ev temizliği call
    }//main sonu
    public static void method01() {
        System.out.println("   *** method-01 çalışyor   ***   ");//method entry
        ebikGabık++;
        int a = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            a += 2 * i;
        }
        System.out.println();//Hz. dummy
        System.out.println("   *** method-02 call ediliyor   ***   ");
        method02();// Mutfak temizliği call
        System.out.println("   *** method-03 call ediliyor   ***   ");
        method03();// Balkon temizliği call
        System.out.println("   *** method-01 bitti   ***   ");//method exit
    }


    private static void method02() {
        System.out.println("   *** method-02 çalışyor   ***   ");//method entry
        ebikGabık += 5;
        for (int x = 0; x <= 7; x++) {
            System.out.print(x + " ");       }
        System.out.println();//Hz.dummy
        System.out.println("   *** method-02 bitti   ***   ");//method exit
    }
    private static void method03() {
        System.out.println("   *** method-03 çalışyor   ***   ");//method entry
        ebikGabık -= 3;
        for (int y = 0; y <= 5; y++) {
            System.out.print(y + " ");
        }
        System.out.println();//Hz. dummy
        System.out.println("   *** method-03 bitti   ***   ");//method exit
    }

}