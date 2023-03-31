package j26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
// null length i olmaz.

        String str1="";
        String str2=null;

        System.out.println("str1 = " + str1.length());
      //  System.out.println("str2 = " + str2.length());  // NullPointerException

        try {
            System.out.println("str2 = " + str2.length());  // NullPointerException
            System.out.println("try çalıştı.");
        }catch (NullPointerException e) {
            System.out.println("null length i olmaz. catch çalıştı.");
        }
        System.out.println("code sonuna kadar çalıştı.");
    }
}
