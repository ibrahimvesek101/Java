package j26_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        // ClassCastException -> Biribirine dönüştürülemeyen  data type'lar dönüştürme işleminde oluşan Run Time Exception
        Object obj = "JavaCAN'lara selamkeee";
        System.out.println("obj = " + obj);// JavaCAN'lara selamkeee
        String str = (String) obj;//Object data type String data type casting yapıldı
        System.out.println("str = " + str);// JavaCAN'lara selamkeee


        Object sayi = 33;
        //    String  str1= (String) sayi;////Object data type String data type casting yapıldı
        //  System.out.println("str1 = " + str1);//ClassCastException
        try {
            String str1 = (String) sayi;
            System.out.println("Agam try blok'dan selamkeee bu yazıyı okuduysan try sorunsuz catch çalışmaz");
        } catch (ClassCastException e) {
            System.out.println("Agam integer data type  String olur mu");
            System.out.println("Agam bu yazıyı okudysan try exc catch yakaldı");
        }

        try {
            String str2 = (String) obj;
            System.out.println("Agam try blok'dan selamkeee bu yazıyı okuduysan try sorunsuz catch çalışmaz");
        } catch (ClassCastException e) {

            System.out.println("Agam bu yazıyı okudysan try exc catch yakaldı");
        }

        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
    }//main sonu
}//Class sonu