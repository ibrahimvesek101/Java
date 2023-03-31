package j26_Exceptions;

public class C09_CheckedExceptionCreate {

    class EnrolIdCheckedException extends Exception {
        /*
        Convantion Named -> Class name sonuna "Exception" kullanılır.
        "checked exception“ create etmek için , "Exception" class’ına extends edilmeli.
        "String" parametreli olan bir constructor’ın ilk satırına super(); create edilmeli

         */
        private static final int serialVersionUID = 1001;

        private EnrolIdCheckedException(String message) {
            super(message);
        }
    }
}