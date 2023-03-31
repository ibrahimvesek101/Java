package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Task->
        Trafik cezasının değerini hesaplayın code create ediniz
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);

        int currentSpeed = scan.nextInt();

        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.


        if (currentSpeed > 55 && currentSpeed <= 74 && isDriverLicenceAvailable == false) {
            System.out.println(300);
        } else if (currentSpeed > 55 && currentSpeed <= 74 && isDriverLicenceAvailable == true) {
            System.out.println(100);
        } else if (currentSpeed >= 75 && currentSpeed <= 84 && isDriverLicenceAvailable == false) {
            System.out.println(350);
        } else if (currentSpeed >= 75 && currentSpeed <= 84 && isDriverLicenceAvailable == true) {
            System.out.println(150);
        } else if (currentSpeed >= 85 && currentSpeed <= 94 && isDriverLicenceAvailable == false) {
            System.out.println(520);
        } else if (currentSpeed >= 85 && currentSpeed <= 94 && isDriverLicenceAvailable == true) {
            System.out.println(320);
        } else if (currentSpeed > 94 && isDriverLicenceAvailable == false) {
            System.out.println(700);
        } else if (currentSpeed > 94 && isDriverLicenceAvailable == true) {
            System.out.println(500);
        }


    }
}


