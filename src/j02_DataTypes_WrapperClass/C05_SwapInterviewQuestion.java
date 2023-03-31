package j02_DataTypes_WrapperClass;

public class C05_SwapInterviewQuestion {
    public static void main(String[] args) {
        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */


        int sayi1=20;
        int sayi2=34;

        // a)

        System.out.println("Swaptan önce sayı1 -> " + sayi1 + " , " + "sayi2 -> " + sayi2);
        // 1.adim bos bir variable'a  sayi1  atayalim
        int temp=sayi1;

        // 2.adim sayi1'e yeni degerini atayalim
        sayi1= sayi2;

        // 3. adim sayi2'ye temp'e yedekledigimiz sayi1 degerini atayalim
        sayi2= temp;

        System.out.println("Swap'dan sonra sayi1 -> " + sayi1 + " , "+ "sayi2 -> "+ sayi2);

        // b)
        System.out.println("*** b çözümü ***");
        System.out.println("Swaptan önce sayı1 -> " + sayi1 + " , " + "sayi2 -> " + sayi2);

        sayi1= sayi1+sayi2;//sayı1=54

        sayi2=sayi1-sayi2;//sayı2=20

        sayi1=sayi1-sayi2;//sayı1=34

        System.out.println("Swaptan sonra sayı1 -> " +sayi1 + " , " + "sayı2 -> " +sayi2);




    }
}
