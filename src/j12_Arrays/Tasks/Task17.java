package j12_Arrays.Tasks;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...

        int arr[][] = {
                {3, 5},//0. kat
                {2, 42, 1},//1. kat
                {6, 1, 2, 233},//2. kat
        };

int enBuyuk=arr[0][0];

for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>enBuyuk){
                    enBuyuk=arr[i][j];
                }
            }
        }
        System.out.println("Array de en büyük eleman = "+ enBuyuk);
    }
}