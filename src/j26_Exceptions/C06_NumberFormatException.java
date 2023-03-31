package j26_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> numerik formetta olmayan bir value parseInt() meth call edilirse oluşan RTE
        String icardi = "1905";
        System.out.println("icardi = " + icardi);// 1905
        System.out.println("icardi+1903 = " + (icardi + 1903));// 19051903


        int wanda = Integer.parseInt(icardi);//icardi variable int'e convert edilerek wanda ya atandı
        System.out.println("wanda = " + wanda);// 1905
        System.out.println("wanda+1907 = " + (wanda + 1907));//  3812


        String  id="98765432l";
        // int invalidID=Integer.parseInt(id);// RTRE -> NumberFormatException
        //  System.out.println("invalidID = " + invalidID);// RTRE -> NumberFormatException
        int invalidID;
        try {
            invalidID=Integer.parseInt(id);
            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı ");
            System.out.println();
        }catch (NumberFormatException e) {
            id="987654321";
            invalidID=Integer.parseInt(id);
            System.out.println("alsana yeni ıd : "+invalidID);
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");

    }
}
