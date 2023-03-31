package j15_Varargs.Tasks;

public class Task03 {
    public static void main(String[] args) {
         /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi1 = 7;
        String str1 = "sefil javacı Haluk";//
        String str2 = "perfect javacı Abdulhamit";//
        String str3 = "beleştepe muhtarı CEREN";//
        carpUzuuunStrinSayi(sayi1, str1, str2, str3);//


    }//main sonu

    private static void carpUzuuunStrinSayi(int sayi, String ... str) {

        String uzuuunStr="";
        for (String w:str) {
            if (w.length()>uzuuunStr.length()) {
                uzuuunStr=w;
            }
        }
        System.out.println("uzuuunStr = " + uzuuunStr);// perfect javacı Abdulhamit
        System.out.println("uzuuunStr.length() = " + uzuuunStr.length());//25
        System.out.println(sayi * uzuuunStr.length());//175
    }
}