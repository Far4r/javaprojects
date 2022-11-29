package cz.vse.java.library.model;

import java.util.StringJoiner;

public class Book {
    private String title;
    private Author author;
    private int pages;

    public Book(String title, Author author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book book))
            return false;

        if (pages != book.pages)
            return false;
        if (!title.equals(book.title))
            return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + pages;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("author=" + author)
                .add("pages=" + pages)
                .toString();
    }
}
