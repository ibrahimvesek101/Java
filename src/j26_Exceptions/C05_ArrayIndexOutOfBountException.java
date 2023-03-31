package j26_Exceptions;

public class C05_ArrayIndexOutOfBountException {
    public static void main(String[] args) {

        //  ArrayIndexOutOfBoundException-> array'lerde olmayan index elemanı ile işlem yapıldıgında oluşan  RTE

        int sayi[]={33,58,31,44,2,63,21};
        System.out.println(sayi[5]);
      //  System.out.println("sayi[12] = " + sayi[12]);//ArrayIndexOutOfBoundsException

        try{
            System.out.println("sayi[12] = " + sayi[12]);
            System.out.println("try blok çalıştı.");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("exeption fırlatmadı.");
            System.out.println("Olmayan elemanı arıyorsunuz.catch blok çalıştı.");
        }
    }
}
