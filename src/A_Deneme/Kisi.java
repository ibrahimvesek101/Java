package A_Deneme;

import java.util.Scanner;

public class Kisi extends Insan{
 String adı="";
 String soyadı="";
 String memleketi="";


    public static void main(String[] args) {



    }

 public static void kisiMethod(){
    System.out.println("kişi kimlik sahibidir.");

}

    public Kisi(String gozRengi, Double kilo, Double boy, String adı, String soyadı, String memleketi) {
        super(gozRengi, kilo, boy);
        this.adı = adı;
        this.soyadı = soyadı;
        this.memleketi = memleketi;
    }
}

