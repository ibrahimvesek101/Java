package j15_Varargs.Tasks;

public class Task04 {
    public static void main(String[] args) {
        /* Task->
    stringlerin istenilen kadar ilk harflerini yazdıran code create (int i, String...str ) mi olur
*/
        String strArr1[] = {"h", "a", "l", "u", "k"};
        String strArr2[] = {"a", "l", "i"};
        int sayi = 3;
        // aydınType(sayi,strArr1);//hal
        // aydınType(sayi,strArr2);//ali
        aydınType(sayi,"javaTAR", "Abdulhamit", "vaveyla", "ahan da trick");//javAbdvavaha
    }

    private static void aydınType(int sayi, String...str) {
        String birlesenString = "";
        for (String  w:str) {
            birlesenString=birlesenString.concat(w.substring(0,3));
        }
        System.out.println(birlesenString);
    }
}