package Digerleri.Elly_Code.src.lesson02;

public class Q02_Modulus {
    // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
    // Hint: use / and %
    //    input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5
    public static void main(String[] args) {
        int x = 56478;
        int birler = x%10; // 5
        int onlar = (x/10)%10; //4
        int yuzler = (x/100)%10;  //3
        int binler = (x/1000)%10;  //2
        int onbinler = x/10000;  //1

        System.out.println(onbinler+ "\n" + binler + "\n" + yuzler + "\n" +onlar + "\n" + birler);
    }


}