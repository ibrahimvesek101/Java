package j12_Arrays.Tasks;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.
         */
        String[][] arr = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].contains("ohio")) {
                    arr[i][j] = "Florida";

                }
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}

