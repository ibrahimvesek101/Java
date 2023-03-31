package j12_Arrays.Tasks;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.
        int arr[] = {5, 6, 8, 12, 14, 19};
        int yeniArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                yeniArr[i]=arr[i];
            }else {
                yeniArr[i] = arr[i] *-1;
            }
        }
        int toplam = 0;
        for (int i = 0; i < yeniArr.length; i++) {
            toplam +=yeniArr[i];
        }
        System.out.println("toplam = " + toplam);
    }
}
