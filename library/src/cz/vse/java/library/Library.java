package cz.vse.java.library;

import cz.vse.java.library.model.Book;
import java.util.List;

public interface Library {
    
    Book borrow(String title);
    
    void returnBook(Book book);
    
    void register(Book book);
    
    double getAvgPages();

    /**
     * Metoda vrati knihy (dostupne i vypujcene) od daneho autora.
     * 
     * @param firstName jmeno autora
     * @param lastName prijmeni autora
     * @return prijmeni autora
     */
    List<Book> findBooksByAuthor(String firstName, String lastName);

    /**
     * Metoda vrati pocet dostupnych knih od daneho autora.
     * 
     * @param firstName jmeno autora
     * @param lastName prijmeni autora
     * @return pocet knih
     */
    long countAvailableBooksOfAuthor(String firstName, String lastName);

    /**
     * Metoda vrati pocet vsech (dostupnych i vypujcenych) knih.
     * 
     * @return pocet
     */
    int countAllBooks();

    /**
     * Metoda vrati seznam dostupnych knih, ktere maji vice stranek nez je na vstupu metody.
     * 
     * @param pages pocet stranek
     * @return seznam knih
     */
    List<Book> findBooksByPages(int pages);
}
