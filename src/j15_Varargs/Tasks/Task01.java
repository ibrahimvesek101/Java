package j15_Varargs.Tasks;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

        input : "h", "a", "l", "u", "k";
        output : haluk

        input : "a", "l", "i";
        output : ali

         */

        String strArr1[]= {"h", "a", "l", "u", "k"};
        String strArr2[]= {"a", "l", "i"};

        concat(strArr1);//haluk
        concat(strArr2);//ali
        concat("j", "a", "v", "a", "T","A","R");//javaTAR

    }//main sonu

    private static void concat(String... str ) {
        String  birlesmisStr="";//varargs p2li birleşecepi boş string tannımandı
        for (String  w:str) {
            // birlesmisStr+=w;
            birlesmisStr=birlesmisStr.concat(w);
        }
        System.out.println("birlesmisStr = " + birlesmisStr);
    }
}
/*
 stringlerin istenilen kadar ilk harflerini yazdıran code create (int i, String...str ) mi olur

 */