package lesson2a;

import java.util.Objects;

public class Book {
    public String title;
    public int publishingYear;
    public Author author;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return ("Название произведения" + getTitle() +
                "Год написания" + getPublishingYear() + "Автор" + getAuthor().getName() + getAuthor().getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishingYear, author);
    }
}
