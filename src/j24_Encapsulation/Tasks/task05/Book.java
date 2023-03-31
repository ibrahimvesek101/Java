package j24_Encapsulation.Tasks.task05;
import java.util.Scanner;
public class Book {// outher Class level
    //fields...
private String bookName;
private String authorName;
    //constructor...

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    //getters and setters..

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    //toString method...

    @Override
    public String toString() {
        return
                " 'Kitap adı : " + bookName + '\'' +
                ", ' Yazar adı : " + authorName + '\'';
    }
}
class BookRunner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("hangi kitabı istersiniz ?");
        String kitab = input.nextLine();
        System.out.println("kitabın yazarını giriniz :");
        String yazar = input.nextLine();

        Book b1 = new Book(kitab, yazar);
        System.out.println("b1 = " + b1);
    }
}
