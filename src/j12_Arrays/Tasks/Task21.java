package j12_Arrays.Tasks;

public class Task21 {
    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr[] = {1, 2, 7, 4, 4, 7, 2, 1};

        boolean aynaMi = true;

        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr.length - 1 - i;
            if (arr[i] != arr[a]) {
                aynaMi = false;
            }
        }
        if (aynaMi) {
            System.out.println("Arr niz aynadır.");
        } else System.out.println("Arr niz ayna değil.");
    }
}

