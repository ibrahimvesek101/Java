package Digerleri.CananHoca.Mart29tasks;

import java.util.Random;
import java.util.Scanner;

public class AmiralBattiOyunu {
    final static int max = 10;

    public static void main(String args[]) {
        Random generator =
                new Random(System.currentTimeMillis());
        //      Random generator = new Random();

//gemilerin yerleştirildiği matris
        int gemiler[][] = new int[10][10];
//oyuncunun hamlelerinin tutulduğu matris
        int oyuncu[][] = new int[10][10];

//gemilerin adedini tutan dizi
//0 nolu eleman kullanılmıyor
        int gemi[] = {0, 4, 3, 2, 1};
        int i, j;
        int num, dir, gemiSize, count, r, c, flag;
        int rl, cl; // bu değerler başlangıç kordinatlarının alabileceği üst sınır değerleri
        int right; // geminin sağa doğru uzunluğu +2
        int down;  // geminin aşağı doğru uzunluğu +2
        // right ve downdan birisi mutlaka 1 dir
        int vurus;

        count = 0; // ilgili boyutta yerleştirilen geminin adedini tutuyor
        gemiSize = 1;
        // 1. part: gemilerin random olarak yerleştirlmesi
        while (gemiSize <= 4) {
//yon üretiliyor (0 sağa, 1 aşağıya)
            dir = generator.nextInt(2);

//yöne göre satır sütun sınırları ve
//yerleştirilecek
// geminin sınırları belirleniyor
            if (dir == 0) {
                rl = max;
                cl = max - gemiSize + 1;
                right = gemiSize + 2;
                down = 1 + 2;
            } else {
                rl = max - gemiSize + 1;
                cl = max;
                right = 1 + 2;
                down = gemiSize + 2;
            }
//geminin yerleştirileceği yerin başlangıç kordinatları üretiliyor
            r = generator.nextInt(rl);
            c = generator.nextInt(cl);
//geminin yerleştirileceği yerin
//boş olup olmadığına bakılıyor
            flag = 0;
            for (i = r - 1; i < (r - 1) + down; i = i + 1)
                for (j = c - 1; j < (c - 1) + right; j = j + 1)
                    if (i >= 0 && i < max && j >= 0 && j < max)
                        if (gemiler[i][j] != 0)
                            flag = 1;
//flag'in 0'a eşit olması geminin
// yerleştirileceği yerin
//boş olduğunu gösteriyor.
            if (flag == 0) {
//gemi yerleştiriliyor
                for (i = r; i < r + down - 2; i = i + 1)
                    for (j = c; j < c + right - 2; j = j + 1)
                        gemiler[i][j] = gemiSize;
//adet bir arttırılıyor
                count = count + 1;
//gemiden istenen adet
// yerleştirilmişse
//bir sonraki gemiye geçiliyor
                if (gemi[gemiSize] == count) {
                    gemiSize = gemiSize + 1;
                    count = 0;
                }
            }
        }
//gemilerin yerleştirildiği
// matris yazdırılıyor
        for (i = 0; i < max; i = i + 1) {
            for (j = 0; j < max; j = j + 1)
                System.out.print(gemiler[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        // part 2: atış yapma
//toplam 20 isabetli atış
// yapıldığında oyun bitiyor
        int atisSayisi = 0; // toplam atış sayısı
        vurus = 0; // isabetli atış sayısı
        while (vurus < 20) {
//atış sayısı bir arttırılıyor
            atisSayisi = atisSayisi + 1;
//atış yapılıyor
            Scanner input = new Scanner(System.in);
            System.out.print("Satiri giriniz : ");
            r = input.nextInt();
            System.out.print("Sutunu giriniz : ");
            c = input.nextInt();
//atışın isabetli olup olmadığına bakılıyor
//eğer isabetli ise oyuncunun matrisine 7 yazdırılıyor
// değil ise 9 sayısı yazdırılıyor
            if (gemiler[r][c] != 0) {
                vurus = vurus + 1;
                oyuncu[r][c] = gemiler[r][c];
                oyuncu[r][c] = 7;
            } else oyuncu[r][c] = 9;

            matrisleriYazdir(gemiler, oyuncu);
        }
        System.out.println("Tebrikler! " + atisSayisi + " adimda bildiniz.");
    }

    private static void matrisleriYazdir(int[][] gemiler, int[][] oyuncu) {
        System.out.println("Gemiler                      Oyuncunun matrisi");
        for (int i = 0; i < max; i = i + 1) {
            for (int j = 0; j < max; j = j + 1)
                System.out.print(gemiler[i][j] + " ");
            System.out.print("  --   ");
            for (int j = 0; j < max; j = j + 1)
                System.out.print(oyuncu[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}
