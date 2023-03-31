package j12_Arrays.Tasks;

public class Task14_string_araSayı_top {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "a2d5e1r4d3";

        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                toplam+=Integer.valueOf(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(toplam);
    }
}

