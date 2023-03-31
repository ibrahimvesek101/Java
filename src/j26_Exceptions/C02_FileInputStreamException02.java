package j26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try { // outher try blok
            FileInputStream fis = new FileInputStream("/Users/ibrahim/IdeaProjects/JavaLearn/src/j26_Exceptions/DataDosyasi");
            int k; //file de ulaşılan herbir karakterin ascii değeri...

            while (((k = fis.read()) != -1)) {
                // inner try blok
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) { //outer catch blok
            System.out.println("outer catch blok DOSYAYA ULAŞILAMIYOR.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("code sonuna kadar çalıştı.");
    }
}
