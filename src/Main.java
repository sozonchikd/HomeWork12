import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Обьекты и классы.
        Author author1 = new Author("Джорж", "Оруэлл");
        Book book1 = new Book("1984", author1, 1949);

        Author author2 = new Author("Даниел", "Киз");
        Book book2 = new Book("Цветы для Элджернона", author2, 1959);

        Author author3 = new Author("Джорж", "Оруэлл");
        Book book3 = new Book("1984", author1, 1949);

        System.out.println("Книга 1 = " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        book1.setYear(1980);
        System.out.println("Год публикации " + book1.getYear());

        System.out.println(book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(author1.equals(author3));
    }
}