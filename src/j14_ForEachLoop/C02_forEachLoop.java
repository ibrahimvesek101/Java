package j14_ForEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {
        // task array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
        int carpim=1;

        for (int a[] :arr ) {//kat tekrarı

            for (int b:a) {//daire tekrarı
                carpim*=b;
            }
        }
        System.out.println("carpim = " + carpim);//5040
    }
}









