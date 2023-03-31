package j12_Arrays.Tasks;

public class Task11_list_ş_top {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
       // String str = "$1 $2 £1 £2 $3 $4 $5 £3 ";
        int dolar = 0;
        int sterlin = 0;

        String arr[] = str.substring(0, str.length() - 1).split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                dolar++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("£")) {
                sterlin++;
            }
        }
        String arrDolar[] = new String[dolar];
        String arrSterlin[] = new String[sterlin];
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                arrDolar[a] = arr[i];
                a++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("£")) {
                arrSterlin[b] = arr[i];
                b++;
            }
        }
        String dolarArrSayi[] = new String[dolar];
        String sterlinArrSayi[] = new String[sterlin];
        int x = 0;
        int y = 0;
        for (int i = 0; i < arrDolar.length; i++) {
            dolarArrSayi[x] = arrDolar[i].replaceAll("\\$", "");
            x++;
        }
        for (int i = 0; i < arrSterlin.length; i++) {
            sterlinArrSayi[y] = arrSterlin[i].replaceAll("£", "");
            y++;
        }

        int dolarArr[] = new int[dolar];
        int sterlinArr[] = new int[sterlin];

        int aa = 0;
        int bb = 0;
        for (int i = 0; i < dolarArrSayi.length; i++) {
            dolarArr[aa] = Integer.parseInt(dolarArrSayi[i]);
            aa++;
        }
        for (int i = 0; i < sterlinArrSayi.length; i++) {
            sterlinArr[bb] = Integer.parseInt(sterlinArrSayi[i]);
            bb++;
        }
        int dolarToplam = 0;
        int sterlinToplam = 0;
        for (int i = 0; i < dolarArrSayi.length; i++) {
            dolarToplam += dolarArr[i];
        }
        for (int i = 0; i < sterlinArrSayi.length; i++) {
            sterlinToplam += sterlinArr[i];
        }

        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("sterlinToplam = " + sterlinToplam);
    }
}