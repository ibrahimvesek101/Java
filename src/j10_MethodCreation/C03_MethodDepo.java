package j10_MethodCreation;

public class C03_MethodDepo {//main yok sadece depo.

    public static void gecmeNotu(int not){

        if (not>=85){
            System.out.println("Takdir belgesi aldınız");
        } else if (not >= 70) {
            System.out.println("Teşekkür belgesi aldınız.");
        } else if (not >= 50) {
            System.out.println("Belgesiz geçtiniz.");
        }else {
            System.out.println("Sınıfta kaldınız");
        }


    }

}