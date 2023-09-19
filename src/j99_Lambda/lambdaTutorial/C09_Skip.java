package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_Skip {
    public static void main(String[] args) {

        //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        // akıs n den daha az eleman içeriyorsa  skip(n) meth dan sonra boş akıs return eder.skip(n) ara işlemdir.

        List<String> yemekList = new ArrayList<>(Arrays.asList("Antep_Baklava", "güllaç", "Sütlaç", "künefe", "güllaç", "baklava"));


        System.out.println("   task01   ");
        ilkİkiHaricSonHarfSıralı( yemekList);



}

// Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print eden code create ediniz.

    public static void ilkİkiHaricSonHarfSıralı(List<String> yemekList){
        System.out.println("   version-1   ");

        yemekList
                .stream()
                .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                .skip(2)
                .forEach(C01_LambdaExpression::yazdirStr);

        System.out.println("\n   version-2   ");
        System.out.println(Arrays.toString(yemekList
                .stream()
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .skip(2)
                .toArray()));
    }

}
