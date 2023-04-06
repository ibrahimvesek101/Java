package j26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("/Users/ibrahim/IdeaProjects/JavaLearn/src/j26_Exceptions/DataDosyasi");

        int k;
        while ((k=fis.read())!=-1){ //fis.read() meth ile ulaşılan file ascii değerleri -1 olmama şartı.
            System.out.print((char) k);
        }
        System.out.println("app sorunsuz çalıştı.");

    }
}
