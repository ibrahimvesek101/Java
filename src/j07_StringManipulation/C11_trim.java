package j07_StringManipulation;

public class C11_trim {
    public static void main(String[] args) {
     /*
  trim()-> İstediğimiz String’in başında veya sonunda varolan boşluk (space)’leri temizler.

         */
        String str = "    javaCAN'lara selam bolcana offer :)      ";
        System.out.println("str = " + str);//     javaCAN'lara selam bolcana offer :)
        System.out.println("str.length() = " + str.length());//str.length() = 45

        System.out.println("str.trim() = " + str.trim());//javaCAN'lara selam bolcana offer :)

        System.out.println("str.trim().length() = " + str.trim().length());//str.trim().length() = 35
    }
}