package Digerleri.interview.src.Day03;

public class Q06_MultipleMethodVarargs {
    /*
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız ( varargs )
 */
    public static void main(String[] args) {
        ortalamaBul("fatih", 56,67,85,95,80,100);
        ortalamaBul("gulsum", 75,80,64,95);
        ortalamaBul("sumeyra", 85,95,82);
        ortalamaBul("nazli", 100,80,65,90,65);

    }

    private static void ortalamaBul(String name, double...notes) {
        double sum=0;
        for (double eleman:notes){
            sum +=eleman;
        }
        System.out.println(name + " in not ortalaması = "+sum/ notes.length);
    }

}
