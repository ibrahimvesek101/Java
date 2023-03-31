package j31_Map.Tasks;

import java.util.HashMap;

public class Task01 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);

        // task -> urun fiyatları toplamını hesaplayan code create ediniz..
        int toplam = 0;
        for (int a : map.values()) {
            toplam += a;
        }
        System.out.println(toplam);
    }
}
