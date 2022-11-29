import cz.vse.java.library.Library;
import cz.vse.java.library.LibraryImpl;
import cz.vse.java.library.model.Author;
import cz.vse.java.library.model.Book;

public class Main {
    public static void main(String[] args) {
        Library library = new LibraryImpl();
        library.register(new Book("Harry Potter", new Author("J.K.", "Rowling"), 400));

        System.out.println(library.borrow("Harry Potter"));


        
    }
}