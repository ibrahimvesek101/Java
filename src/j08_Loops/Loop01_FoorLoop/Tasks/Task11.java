package j08_Loops.Loop01_FoorLoop.Tasks;

public class Task11 {
    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */


        int harf =65;

        for (int kat = 0; kat <6 ; kat++) {

            for (int daire = 0; daire <=kat ; daire++) {

                System.out.print((char)(harf +daire)+" ");

            }
            System.out.println();
        }

    }
}
