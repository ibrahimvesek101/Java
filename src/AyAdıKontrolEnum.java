import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public enum AyAdıKontrolEnum {
    OCAK,
    ŞUBAT,
    MART,
    NİSAN,
    MAYIS,
    HAZİRAN,
    TEMMUZ,
    AĞUSTOS,
    EYLÜL,
    EKİM,
    KASIM,
    ARALIK;
    static ArrayList<AyAdıKontrolEnum> aylarList;

    public static void main(String[] args) {

        enumListVarlıkDene();

    }
    private static void enumListVarlıkDene() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen bir ay adı giriniz : ");
            AyAdıKontrolEnum metin = AyAdıKontrolEnum.valueOf(input.nextLine());

            ArrayList<AyAdıKontrolEnum> aylarList = new ArrayList<>(Arrays.asList(AyAdıKontrolEnum.OCAK, AyAdıKontrolEnum.ŞUBAT, AyAdıKontrolEnum.MART, AyAdıKontrolEnum.NİSAN, AyAdıKontrolEnum.MAYIS, AyAdıKontrolEnum.HAZİRAN, AyAdıKontrolEnum.TEMMUZ, AyAdıKontrolEnum.AĞUSTOS, AyAdıKontrolEnum.EYLÜL, AyAdıKontrolEnum.EKİM, AyAdıKontrolEnum.KASIM, AyAdıKontrolEnum.ARALIK));

            if (aylarList.contains(metin)) {
                System.out.println("Girdiğiniz ay var");
            }
        } catch (Exception e) {

            System.out.println("Girdiğiniz ay yok");
            enumListVarlıkDene();
        }
    }
}

