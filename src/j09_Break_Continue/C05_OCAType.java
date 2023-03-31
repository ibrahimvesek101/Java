package j09_Break_Continue;

public class C05_OCAType {
    public static void main(String[] args) {

        // çıktısı nedir?

        int count = 0;
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue;
                count++;
            }
        }
        System.out.println(count);

    }
}
