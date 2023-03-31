package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task15 {

    /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            int kotrol =0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kotrol = 1;
                break;
                }
            }
            if (kotrol ==0) {
                System.out.print(i + " ");
            }
        }
    }
}