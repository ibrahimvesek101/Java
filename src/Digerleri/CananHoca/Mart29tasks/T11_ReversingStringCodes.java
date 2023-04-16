package Digerleri.CananHoca.Mart29tasks;


public class T11_ReversingStringCodes {
    public static void main(String[] args) {

        // Stringi ters çevir
        String str = "javaCAN & JAVATAR";

        // Output: RATAVAJ & NACavaj
        tersCevir(str);

    }

    private static void tersCevir(String str) {
        String s3="";
        for (int i = 0; i < str.length(); i++) {
            s3= str.charAt(i) + s3; // j, aj, vaj
        }
        System.out.println(s3);

    }
}
