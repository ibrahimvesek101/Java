package Digerleri.CananHoca.Mart29tasks;

public class T07_RomaRakamlari {
    public static void main(String[] args) {
         /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805

		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır
		   		 (C-100, M-1000) ---> [C M]=900

		   		I= 1
                V= 5
                X= 10
                L= 50
                C= 100;
                D= 500;
                M= 1000;



                DCCCV
                500+ 100+ 100+ 100+ 5 =805

                M CM XL V
                1000+ 900+ 40+ 5 =1945

		*/
        String s= "DCCCV";
        romenRakami(s);
        System.out.println(romenRakami(s));

    }

    private static int romenRakami(String s) {
        int toplam= 0;
        // iki harfin bir araya gelmesinden oluşan sayılar toplanır
        // örnek: CM= 900
        // M V

        for (int i = 0; i < s.length() - 1; i++) {
            if (harfinDegeri(s.charAt(i)) < harfinDegeri(s.charAt(i + 1))) {
                toplam +=  harfinDegeri(s.charAt(i + 1)) - harfinDegeri(s.charAt(i));
                s= s.replace(s.substring(i, i+2), "");
                i--;
            } // 900+40 = 940 = toplam
        }

        for (int i = 0; i < s.length(); i++) {
            toplam+= harfinDegeri(s.charAt(i));
        } //1945 = toplam

        return toplam;
    }

    private static int harfinDegeri(char a) {
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        return 0;
    }


}
