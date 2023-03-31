package j12_Arrays.Tasks;

public class Task16 {
    public static void main(String[] args) {

        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz

        int arr[][] = {
                {3, 5},//0. kat
                {2, 4, 1},//1. kat
                {6, 1, 2, 2},//2. kat
        };
        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            carpim *= arr[i][arr[i].length - 1];

        }
        System.out.println("son elemanların carpimı = " + carpim);
    }
}