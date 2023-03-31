package Digerleri.Elly_Code.src.lesson03;

public class Q19_ForLoop {
    /*
    Interview Question
    1'den 100'e kadar olan sayilari yazdiriniz..
    Ancak kodunuzda herhangi bir sayi kullanmayiniz!
    */
    public static void main(String[] args) {
        System.out.println("1.yol");
        for (int i = 'a'/'a'; i <='d' ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("2.yol");
        String x = " ";
        for (int i = x.length(); i <='d'; i++) {
            System.out.print( i+ " ");
        }
        System.out.println();
        System.out.println("3.yol");
        int one = 'A'/'A';
        String s1 = "..........";
        for (int i = one; i <= s1.length()* s1.length(); i++) {
            System.out.print(i + " ");
        }
    }
}
