package Digerleri.Elly_Code.src.lesson02;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
    public static void main(String[] args) {
        char finalNot = 'A';

        String result = finalNot == 'A' ? "Gayet Basarili" :
                finalNot == 'B' ? "Basarili" :
                        finalNot == 'C' ? "Ha gayret" : "Digerleri..";

        System.out.println("result = " + result);
    }

}
