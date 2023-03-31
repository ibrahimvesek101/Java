package j19_StringBuilder;

public class Task {
    public static void main(String[] args) {

        /*
        Task->
     Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren
     ve cümlenin palindrom
     olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) METHOD create ediniz.
    (without case sensitivity)

    Ex : input : javaCAN'lara selam olsun :)
    Output: "Reversed sentence : ): nuslo males aral'NACavaj

    It is not a palindrome"

         */
        StringBuilder cumle = new StringBuilder("balıkesir");

        tersStringBuilder(cumle);
        String str="ece";
        System.out.println("isPolindrome(str) = " + isPolindrome(str));
        System.out.println("isPolindrome(\"ey edip adanada pide ye\") = " + isPolindrome("ey edip adanada pide ye"));
    }

    private static boolean isPolindrome(String str) {

        return new StringBuilder(str).
                reverse().
                toString().
                equals(str);
    }

    private static void tersStringBuilder(StringBuilder cumle) {

        System.out.println("Girilen metnin index e göre tersi : " + cumle.reverse());

    }
}
