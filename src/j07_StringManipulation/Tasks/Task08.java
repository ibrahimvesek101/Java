package j07_StringManipulation.Tasks;

public class Task08 {
    public static void main(String[] args) {

        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("" + harfDepo.charAt(harfDepo.indexOf('I')) + harfDepo.charAt(harfDepo.indexOf('B')) +
                harfDepo.charAt(harfDepo.indexOf('R')) + harfDepo.charAt(harfDepo.indexOf('A')) + harfDepo.charAt(harfDepo.indexOf('H')) +
                harfDepo.charAt(harfDepo.indexOf('I')) + harfDepo.charAt(harfDepo.indexOf('M')));


    }
}
