public class Main {
    public static void main(String[] args) {
        // Обьекты и классы.
        Author author1 = new Author("Джорж", "Оруэлл");
        Book book1 = new Book("1984", author1, 1949);

        Author author2 = new Author("Даниел", "Киз");
        Book book2 = new Book("Цветы для Элджернона", author2, 1959);
        System.out.print("Книга 1 = " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println();
        book1.setYear(1980);
        System.out.println("Год публикации " + book1.getYear());

        System.out.println(book1);
    }
}