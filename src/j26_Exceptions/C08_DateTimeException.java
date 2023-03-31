package j26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

       // LocalDate date = LocalDate.of(2023, 4, 29);

try {
    LocalDate d1=LocalDate.of(2023, 2, 29);
    System.out.println("exception fırlatmadı");

}catch (Exception e) {
    System.out.println("hatalı girdi yapıldı. "+e.getMessage());
    System.out.println("exception fırlatttı handle ettik.");

}

        System.out.println("app sonuna kadar çalıştı.");

    }

}
