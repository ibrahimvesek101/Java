package j20_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {//main level


        C03_Student ogrc1=new C03_Student();//C03_Student classdan ogrc1 obj create edildi.
        ogrc1.ad="Vedat";
        ogrc1.soyAd="offer";
        ogrc1.okulNo=1453;
        //ogrc1.sınıf=1;
        ogrc1.ortalama=70;
        ogrc1.takdirBelgesi=false;
        ogrc1.mezuniyet(ogrc1.ortalama);
        ogrc1.sosyalFaaliyet();
        System.out.println(ogrc1);//

        C03_Student ogrc2=new C03_Student();
        ogrc2.ad="Ceren";
        ogrc2.soyAd="Team Lead";
        ogrc2.okulNo=1905;
        ogrc2.sınıf=1;
        ogrc2.ortalama=81;
        // ogrc2.takdirBelgesi=true;
        ogrc2.mezuniyet(ogrc2.ortalama);
        ogrc2.sosyalFaaliyet();
        System.out.println(ogrc2);//

    }//main sonu
}