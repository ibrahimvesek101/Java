package j32_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        User kullanici1 = new User();
        kullanici1.name = "ibrahim";
     //   kullanici1.role = 0;
     //   kullanici1.status = 2;
        kullanici1.yetki = Role.ADMİN;
        kullanici1.durum=Status.ACTIVE;


        User kullanici2 = new User();
        kullanici2.name = "ibrahim";
       // kullanici2.role = 0;
       // kullanici2.status = 2;
        kullanici2.name="neda";
        kullanici2.yetki = Role.CUSTOMER;
        kullanici2.durum=Status.INACTIVE;

        if (kullanici2.yetki==Role.ADMİN){
            System.out.println(kullanici2.name+" mühür sahibisiniz. ADMİNSİN");
        }else {
            System.out.println(kullanici2.name+" müşteriler silme yapamaz.");
        }

        if (kullanici1.yetki==Role.ADMİN){
            System.out.println(kullanici1.name+" mühür sahibisiniz. ADMİNSİN");
        }else {
            System.out.println(kullanici1.name+" müşteriler silme yapamaz.");
        }
    }
}
