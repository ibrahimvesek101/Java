package j21_StaticKeyword;
public class C03_StaticKeyword {//class level
    int ogrcId;//ins. obj  variable
    static int ogrcSayisi;//static güneş
    public C03_StaticKeyword() {//p'siz cons.
        ogrcSayisi++;//bu cons her call edildiğinde yani obj create edildiğinde
        // ogrcSayisi static variable kalıcı olarak 1 artırılır

        ogrcId = 1;//bu cons her call edildiğinde yani obj create edildiğinde
        //ogrcID create edilen obj değeri olarak atanıs
    }

    public static void main(String[] args) {///main level
        System.out.println("obj a öncesi ogrcSayisi = " + ogrcSayisi);// 0
        C03_StaticKeyword a = new C03_StaticKeyword();//a ogrc create edildiğinde
        System.out.println("obj a sonrası ogrcSayisi = " + ogrcSayisi);//1

        C03_StaticKeyword b = new C03_StaticKeyword();//b ogrc create edildiğinde
        C03_StaticKeyword c = new C03_StaticKeyword();//c ogrc create edildiğinde
        C03_StaticKeyword d = new C03_StaticKeyword();//d ogrc create edildiğinde
        System.out.println("obj absd sonrasıogrcSayisi = " + ogrcSayisi);//4

        C03_StaticKeyword e;//obj decleration var ama assaingment yok->cons call yapılmadı henüz
        System.out.println("e sorası ogrcSayisi = " + ogrcSayisi);//4
        System.out.println("a.ogrcId = " + a.ogrcId);//1
        System.out.println("b.ogrcId = " + b.ogrcId);//2
        System.out.println("c.ogrcId = " + c.ogrcId);//3
        System.out.println("d.ogrcId = " + d.ogrcId);//4
        // System.out.println("e.ogrcId = " + e.ogrcId);->CTE
        System.out.println("gunun sonunda ogrcSayisi = " + ogrcSayisi);// 4

    }//main sonu
 }