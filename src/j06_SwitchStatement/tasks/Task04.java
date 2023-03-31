package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay isimine göre   ayin kac cektigini print eden code create ediniz.
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir ay ismi giriniz :");
        String ay = input.next().toLowerCase();

        switch (ay) {

            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("31");
                break;

            case "eylül":
            case "kasım":
            case "nisan":
            case "haziran":
                System.out.println("30");
                break;

            case "şubat":

                System.out.print("Lütfen hangi yılda olduğunuzu giriniz :");
                int yil= input.nextInt();
                if(yil%4==0){
                    System.out.println("29");
                }else
                    System.out.println("28");
            break;
            default:
                System.out.println("yanlış giriş yapıldı");
        }
    }

}
