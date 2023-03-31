package j08_Loops.Loop01_FoorLoop.Tasks;

public class Task20 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.<



        for (int i = 1; i <= 5; i++) {

            System.out.print( i+ " ");

            for (int j = 2; j <= i; j++) {

                System.out.print((i+j+ " "));

            }
            System.out.println();
        }


    }
}
