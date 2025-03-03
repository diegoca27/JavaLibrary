package LibraryJava;

import java.util.Scanner;

public class MainLibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Search Book");
            System.out.println("5. Register Patron");
            System.out.println("6. Display Patrons");
            System.out.println("7. Borrow Book");
            System.out.println("8. Return Book");
            System.out.println("9. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter number of copies: ");
                    int copies = scanner.nextInt();
                    library.addBook(title, author, copies);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    int isbnToRemove = scanner.nextInt();
                    library.removeBooks(isbnToRemove);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 5:
                    System.out.print("Enter patron name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patron ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter additional info: ");
                    String additionalInfo = scanner.nextLine();
                    library.registerPatron(name, id, address, additionalInfo);
                    System.out.println("Patron registered successfully.");
                    break;

                case 6:
                    library.displayPatrons();
                    break;

                case 7:
                    System.out.print("Enter ISBN to borrow: ");
                    int isbnBorrow = scanner.nextInt();
                    System.out.print("Enter patron ID: ");
                    int patronIdBorrow = scanner.nextInt();
                    library.borrowBook(isbnBorrow, patronIdBorrow);
                    break;

                case 8:
                    System.out.print("Enter ISBN to return: ");
                    int isbnReturn = scanner.nextInt();
                    System.out.print("Enter patron ID: ");
                    int patronIdReturn = scanner.nextInt();
                    library.returnBook(isbnReturn, patronIdReturn);
                    break;

                case 9:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
