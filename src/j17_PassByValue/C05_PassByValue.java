
package j17_PassByValue;

public class C05_PassByValue {

    public static void main(String[] args) {
        /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
       2 .değişklik  yapılan variable'lar atama tanımlanır.

         */

        double etiketFiyatı=100;//primitive main scope variable
        double indirimOrani=0.1;//primitive main scope variable

        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);//100.0

        System.out.println("indirimli fiyat = " + indir(etiketFiyatı, indirimOrani));//90.0

        etiketFiyatı = indir(etiketFiyatı,indirimOrani);//

        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);//90.0

    }//main sonu

    public  static  double  indir(double fiyat,double oran){
        return   fiyat*=(1-oran);

    }
}