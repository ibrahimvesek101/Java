package j07_StringManipulation;

public class C12_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String bagis1 = "10000";
        String bagis2 = "20316";
        System.out.println("toplamı : " + (bagis1 + bagis2));//concat->1000020316
        int yas = 48;//primitive
        Integer age = 48;//non-primitive: Wrapper class
        int yeniBagis1 = Integer.valueOf(bagis1);//bagıs1 Stringin değereini integere cevirip yaeniBagıs1'a atandı
        int yeniBagis2 = Integer.valueOf(bagis2);//bagıs2 Stringin değereini integere cevirip yaeniBagıs2'a atandı

        System.out.println("bagıs toplamı : " + (yeniBagis1 + yeniBagis2));// aritmetik + -> 30316

        int Tc = 987654321;
        String tcStr = String.valueOf(Tc);//int Tc değerii Stringe atandı

        System.out.println("tcStr = " + tcStr);//987654321
        System.out.println("(tcStr+Tc) = " + (tcStr + Tc));//987654321987654321
        String iphone = "$1500";
        String ipad = "$1200";
        // int iphoneFiyat = Integer.valueOf(iphone);//RTE $ number değil
        int iphoneFiyat= Integer.valueOf(iphone.substring(1)) ;
        int ipadFiyat= Integer.valueOf(ipad.substring(1)) ;

        System.out.println("toplam fiyat = " + (iphoneFiyat+ipadFiyat));//2700

        /*
    Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak
     strA+strB toplamını print den code create ediniz
       output: strA+strB=31.54
         */

        String strA="$13.99";
        String strB="$17.55";

        double stra= Double.parseDouble(strA.replaceAll("\\D",""));
        double strb= Double.parseDouble(strB.replaceAll("\\D",""));
        double straa= Double.parseDouble(strA.substring(1));
        double strbb= Double.parseDouble(strB.substring(1));

        System.out.println("toplam : "+(straa+strbb));//31.54

        System.out.println(" toplam : "+((stra+strb)/100));// 31.54

        System.out.println(" toplam : "+(strA+strB));// $13.99$17.55

    }
}