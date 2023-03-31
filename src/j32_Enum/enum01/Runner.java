package j32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {

        //task- > verilen ayın numarasına göre kaç gün olduğunu prınt ediniz.

       // int ay = 3;
Aylar ay =Aylar.MART;
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());


        switch (ay) {
            case OCAK:
                System.out.println("ocak 31 gündür.");
                break;
            case ŞUBAT:
                System.out.println("şubat 28 gündür.");
                break;
            case MART:
                System.out.println("mart 31 gündür.");
                break;
            case NİSAN:
                System.out.println("nisan 30 gündür.");
                break;
            case MAYIS:
                System.out.println("mayıs 31 gündür.");
                break;
            case HAZİRAN:
                System.out.println("haziran 30 gündür.");
                break;
            case TEMMUZ:
                System.out.println("temmuz 31 gündür.");
                break;
            case AĞUSTOS:
                System.out.println("ağustos 31 gündür.");
                break;
            case EYLÜL:
                System.out.println("eylül 30 gündür.");
                break;
            case EKİM:
                System.out.println("ekim 31 gündür.");
                break;
            case KASIM:
                System.out.println("kasım 30 gündür.");
                break;
            case ARALIK:
                System.out.println("aralık 31 gündür.");
                break;
        }
    }
}
