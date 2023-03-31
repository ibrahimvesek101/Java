package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */


        ArrayList<String> isimler=new ArrayList<>(Arrays.asList("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));

        String depo2;
        depo2=isimler.get(2);

        isimler.set(2,isimler.get(7));
        isimler.set(7, depo2);

        System.out.println("isimler = " + isimler);
    }
}
