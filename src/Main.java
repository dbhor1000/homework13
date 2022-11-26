public class Main {
    public static void main(String[] args) {

        Author author1;
        author1 = new Author("Лев", "Толстой");

        Author author2;
        author2 = new Author("Александр", "Пушкин");

        Book book1;
        book1 = new Book("Воина и Мир", author1, 1868);

        Book book2;
        book2 = new Book("Руслан и Людмила", author2, 1820);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book1.setBookYear(1867);

        System.out.println(book1.toString());





    }
}