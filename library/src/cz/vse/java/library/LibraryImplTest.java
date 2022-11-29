package cz.vse.java.library;

import static org.junit.jupiter.api.Assertions.*;

import cz.vse.java.library.model.Author;
import cz.vse.java.library.model.Book;
import org.junit.jupiter.api.Test;

class LibraryImplTest {

    @Test
    void getAvgPages() {
        Library library = new LibraryImpl();
        library.register(new Book("Kniha A", new Author("A", "B"), 300));
        library.register(new Book("Kniha B", new Author("C", "D"), 400));
        assertEquals(350.0, library.getAvgPages());
    }

    @Test
    void borrow() {
        Library library = new LibraryImpl();
        Book book = new Book("Kniha A", new Author("A", "B"), 300);
        library.register(book);
        assertEquals(book, library.borrow("Kniha A"));
        assertNull(library.borrow("BBBB"));
    }
    
}