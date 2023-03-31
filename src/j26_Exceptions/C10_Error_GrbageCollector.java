package j26_Exceptions;

public class C10_Error_GrbageCollector {
    /*
    1) Garbage Collector surekli memory'i kontrol ederek  Silinmesi gereken herhangi bir data varsa
    memory'i temiz tutmak icin o data'yi siler.  data'yi silmeden once "finalize" edilir.
    Finalize etmek icin finalize() methodunu call edilir ve method'un ne zaman run edileceğie  Java
    hash code ile arka planda kendisi belirler. code yazılırken istenirse  finalize() methodunu call
    edilebilir ancak methodun ne zaman run edleeğini Java belirler.
	 	2) "final", "finally", "finalize" aciklar misiniz?
    final(keyword): ==> final method override edilemez.
    final variable initialize edilmeli ve  degeri degistirilemez.
    final class child class sahibi olamaz inherit edilemez.
            finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

    finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.

           */

}