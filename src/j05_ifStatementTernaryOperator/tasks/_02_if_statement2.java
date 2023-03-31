package j05_ifStatementTernaryOperator.tasks;

public class _02_if_statement2 {

    public static void main(String[] args) {

        /*İki tane int oluşturun. Birinci (1.) int 26. İkinci (2.) int 35.
          Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
          Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın. */

        //Kodu aşağıya yazınız.
        int birinci = 26;
        int ikinci = 35;

        if (birinci > ikinci) {
            System.out.println("int 1 is greater than int 2");
        }
        if (birinci < ikinci) {
            System.out.println("int 1 is smaller than int 2");
        }

    }
}
