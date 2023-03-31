package j08_Loops.Loop01_FoorLoop;
public class C01_FoorLoop {
    public static void main(String[] args) {

        /*
        Loop-> tekrarlayan actionları tanımlayan code bloklarıdır
         */
        // task-> 41 kere maaşallah print eden code create ediniz...
        //  System.out.println("maaşallah");//1. maaşallah
        //  System.out.println("maaşallah");//2. maaşallah
        //  System.out.println("maaşallah");//3. maaşallah
        //  System.out.println("maaşallah");//4. maaşallah
        //  System.out.println("maaşallah");//5. maaşallah


        //  System.out.println("maaşallah");//41. maaşallah ---> amele style code :( sinemaki code :(

        //  System.out.println("41 kere maaşallah");

        //   baş. value      bitiş value  value değişimi
        //for (int i = 1;     i <=41 ;      i++) {//cincix code -> i=1 den başla i=41 e kadar 1 er artarak devam et->true ise {body de ne varsa  yap}
        //    System.out.println(i+". maaşallah ");
        //}

        // task02-> 2 basamaklı tek sayıları aynı satıra print eden code create ediniz...

        for (int i = 0; i < 100; i++) {
            if (i>9 && i%2==1) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 11; i < 100; i+=2) {
            System.out.print(i+" ");
        }

        for (int i = 0; i >10 ; i++) {//condition daima false ->baba akuyu calmişlar -> çalışmayan loop yapmışlar
            System.out.println("selam javaCAN");
        }

        // for (int i = 0; i >=0 ; i++) {//stop end olmayan infiti loop
        //     System.out.println("bu loop cuğarayı cüpiterten yakana kadar çalışır :) durduran aşk olsun");
        // }

        System.out.println();
        System.out.println("bizim oolan code cincix dewamkeee :)");
    }
}