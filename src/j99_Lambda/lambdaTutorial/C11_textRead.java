package j99_Lambda.lambdaTutorial;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class C11_textRead {
    public static void main(String[] args) throws IOException {
        //TASK 01 --> haluk dosyasini okuyunuz.(Console'a print eden code create ediniz.)

        System.out.println("\n task 01 --> Ibrahim dosyasini okuyunuz");
        Path erisilecekDosya=Path.of("/Users/ibrahim/IdeaProjects/Java_Learn/src/j99_Lambda/lambdaTutorial/Ibrahim");
        // erişilecek dosya yolu tanımlandı.

        Stream<String> dosyaAkısı= Files.lines(erisilecekDosya);

        dosyaAkısı.forEach(System.out::println);



        //TASK 02 --> haluk.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print eden code create ediniz.)

        System.out.println("\n task 02 --> Console'a buyuk harflerle print eden code create ediniz.");

        Files.lines(erisilecekDosya)
                .map(String::toUpperCase)
                .forEach(System.out::println);



        //TASK 03 --> haluk dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz.

        System.out.println("\n task 03 -->Ibrahim dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz");

        Files.lines(erisilecekDosya)
                .limit(1)   //  akıştaki ilk eleman alındı.
                .map(String::toLowerCase)
                .forEach(System.out::println);

        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print eden code create ediniz.

        System.out.println("\n task 04 --> Ibrahim dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print eden code create ediniz");

        System.out.println(Files.lines(erisilecekDosya)
                .filter(t -> t.contains("Basari"))
                .count());


    }
}
