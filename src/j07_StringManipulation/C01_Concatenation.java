package j07_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {

        /*
        concat() -> methodu içinde parametre alığı String variable'yi
        çalşıtığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade vars artimetik toplama
         değil birleştirme yapılır
         */

        String qa = "Safvet";
        String lead = "Vedat";

        System.out.println(qa.concat(lead));//qa String sonuna lead string
        // birleştirildi.->SafvetVedat
        System.out.println("ilk qa:" + qa);//Safvet ->qa.concat(lead) method'da
        // atama yapılmadı
        /*
        ahan da TRİCK-> String methodları variable'yi kalıcı değil geçici
        değişiklik yapar.
        String'de kalıcı değişklik yapmak için atama yapılır...
         */
        qa = qa.concat(lead);
        System.out.println("atamadan sonraki qa = " + qa);//SafvetVedat

        qa = lead.concat(qa);
        System.out.println("en son atamdan sonraki qa = " + qa);//VedatSafvetVedat

        System.out.println(qa.concat("true"));//VedatSafvetVedattrue
        System.out.println(lead.concat(true + "$"));//Vedattrue$
        System.out.println(lead.concat(53 + "çay"));//Vedat53çay

        /*
        Trick-> concat methodu parametre olarak String harici tüm dataları Stringe
         çevirip concat eder.
         String mürekkep gibi bulundugu ortamda diğer dataları etkiler.
         */
    }
}