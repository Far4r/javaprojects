package cz.vse.java.library;

import cz.vse.java.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library {
    
    private List<Book> availableBooks;
    private List<Book> unavailableBooks;

    public LibraryImpl() {
        this.availableBooks = new ArrayList<>();
        this.unavailableBooks = new ArrayList<>();
    }

    @Override
    public Book borrow(String title) {
        for (Book book : this.availableBooks) {
            if (book.getTitle().equals(title)) {
                this.availableBooks.remove(book);
                this.unavailableBooks.add(book);
                return book;
            }
        }
        return null;
    }

    @Override
    public void returnBook(Book book) {
        this.unavailableBooks.remove(book);
        this.availableBooks.add(book);
    }

    @Override
    public void register(Book book) {
        this.availableBooks.add(book);
    }

    @Override
    public double getAvgPages() {
        double total = 0;
        for (Book book : this.availableBooks) {
            total += book.getPages();
        }
        return total/ this.availableBooks.size();
    }

    @Override
    public List<Book> findBooksByAuthor(String firstName, String lastName) {
        List<Book> result = new ArrayList<>();
        
        for (Book book : this.availableBooks) {
            if (book.getAuthor().getFirstName().equals(firstName) && book.getAuthor().getLastName().equals(lastName)) {
                result.add(book);
            }
        }

        for (Book book : this.unavailableBooks) {
            if (book.getAuthor().getFirstName().equals(firstName) && book.getAuthor().getLastName().equals(lastName)) {
                result.add(book);
            }
        }
        
        return result;
    }

    @Override
    public long countAvailableBooksOfAuthor(String firstName, String lastName) {
        return this.availableBooks.stream().filter(book -> book.getAuthor().getFirstName().equals(firstName) && book.getAuthor().getLastName().equals(lastName)).count();
    }

    @Override
    public int countAllBooks() {
        return this.availableBooks.size() + this.unavailableBooks.size();
    }

    @Override
    public List<Book> findBooksByPages(int pages) {
        List<Book> result = new ArrayList<>();
        for (Book book: this.availableBooks) {
            if (book.getPages() > pages) {
                result.add(book);
            }
        }
        return result;
    }

}
