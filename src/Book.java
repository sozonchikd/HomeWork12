import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int year;

    public Book(String nameBook, Author author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return " Название книги '" + this.nameBook + "', год публикации " + this.year + ", автор " + author + ".";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other; // Приведение к типу который ожидаем
        return year == book.year && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}

