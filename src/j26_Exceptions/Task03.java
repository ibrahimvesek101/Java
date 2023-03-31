package j26_Exceptions;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        /*
'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
int v = vize
int f = final

Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
Diğer durumlarda ise,
vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
vizeye 120, finale 80 girin.

Programın çalışmasını sağlayın. (handle edin)
 */
        Scanner input = new Scanner(System.in);

        int vizeNotu;
        int finalNotu;

        while (true){
            try {
                System.out.println("vize notunu giriniz : ");
                 vizeNotu = input.nextInt();

                if (vizeNotu < 0 || vizeNotu > 100) {
                    throw new ArithmeticException("Notlar 0-100 arasında olmalı");

                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("hatalı giriş yaptınız."+e.getMessage());

            }
        }
        while (true){
            try {
                System.out.println("final notunu giriniz : ");
                finalNotu = input.nextInt();

                if (finalNotu< 0 || finalNotu > 100) {
                    throw new ArithmeticException("Notlar 0-100 arasında olmalı");

                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("hatalı giriş yaptınız."+e.getMessage());
            }
        }
        ortalama(vizeNotu, finalNotu);
    }

    private static double ortalama(int vizeNotu, int finalNotu) {

       return (vizeNotu*0.4) + (finalNotu*0.6);

    }
}
