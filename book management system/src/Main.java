
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter book ID to borrow: ");
                    bookId = scanner.nextLine();
                    library.borrowBook(bookId);
                    break;
                case 4:
                    System.out.print("Enter book ID to return: ");
                    bookId = scanner.nextLine();
                    library.returnBook(bookId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid the user");


            }

        }
    }
}
