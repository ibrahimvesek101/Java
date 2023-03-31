package j12_Arrays.Tasks;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int arr[] = {14, 19, 5, 21};

        int kucuk=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<kucuk){
                kucuk=arr[i];
            }
        }
        System.out.println(kucuk);
    }
}

