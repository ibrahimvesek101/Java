package j18_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1 = "İbrahim";  //ilk değer ataması (initial) yaptık. (pool)
        String str2 = "İbrahim";  //str1 ve str2 değerleri aynı atanır.  (pool)

        String str3 = new String("İbrahim"); // (heap) te saklanır.
        String str4 = new String("İbrahim"); // (heap) te saklanır.

        String str5 = str1 + "";
        System.out.println(str1 == str2); //
        System.out.println(str1 == str3); //
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //
        System.out.println(str3 == str4); //
        System.out.println(str1 == str5); //
        System.out.println("str1.equals(str5) = " + str1.equals(str5)); //

    }
}
