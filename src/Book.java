import java.util.Objects;

public class Book {

    String bookName;
    Author bookAuthorName;
    int bookYear;

    public Book(String bookName, Author bookAuthorName, int bookYear) {

        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookYear = bookYear;

    }

    public String getBookName() {

        return bookName;

    }

    public Author getBookAuthorName() {

        return bookAuthorName;

    }

    public int getBookYear() {

        return  bookYear;

    }

    public void setBookYear(int bookYear) {

        this.bookYear = bookYear;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && bookName.equals(book.bookName) && bookAuthorName.equals(book.bookAuthorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthorName, bookYear);
    }

    @Override
    public String toString() {
        return bookName + " " + bookAuthorName.toString() + " " + bookYear;
    }


}
