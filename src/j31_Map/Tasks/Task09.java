package j31_Map.Tasks;

import java.util.HashMap;

public class Task09 {
    /* Task -> Ad ve soyad bulunduran iki ayrı array'i bir map'de print eden code create ediniz.
     input : {"javaCAN", "javaTAR", "javaNAZ"};  {"Ahmet", "Haluk", "İpek"};
     output:{javaCAN=Ahmet,javaTAR=Haluk,javaNAZ=İpek}
    */

    public static void main(String[] args) {
        String[] firstNames = {"javaCAN", "javaTAR", "javaNAZ"};
        String[] lastNames = {"Ahmet", "Haluk", "İpek"};
        //write you code here

        HashMap<String, String> map = new HashMap<>();

               for (int i = 0; i < firstNames.length; i++) {
                   map.put(firstNames[i], lastNames[i]);
               }
        System.out.println(map);

       //for (String st : firstNames){

       //    for (String str : lastNames){
       //        map.put(st, str);
       //    }
       //}
       //System.out.println(map);


    }
}
