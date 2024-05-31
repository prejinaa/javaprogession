import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");

    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);

            }
        }
    }

    public void borrowBook(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                book.borrow();
                return;

            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
