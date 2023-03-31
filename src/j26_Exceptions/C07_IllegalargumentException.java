package j26_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException {
    public static void main(String[] args) {

        /*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */


// IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
// ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..

        Scanner input = new Scanner(System.in);
        System.out.print("yaşınızı giriniz : ");
        int yas= input.nextInt();

        try {
            if (yas<18) {

                throw new IllegalArgumentException(" bu yaşta ehliyet alınmaz.");

                // throw key word ile Exc. obj oluşturularak hata tanımlanır  ve fırlatılır.
                //Böylece sartımıza uymayan(yas<18)  value için catch blok'a düşürülerek hata handle edilmesi sağlanır.

            }else {
                System.out.println("ehliyet alabilirsiniz");
            }

        }catch (IllegalArgumentException e) {   // parantez içine tutmasını isstediğimiz exception yazılır.

            System.out.println("e.getMessage() = " + e.getMessage());   //javaya vermesini istediğimiz bizim özel mesajı yazdırdık.
            System.out.println("yaşınız 18 den küçük olduğu için ehliyet alamazsınız.");
            System.out.println("exception fırlattı. handle ettik");

        }
    }
}
