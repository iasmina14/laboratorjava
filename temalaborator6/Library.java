package temalaborator6;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Metoda de adaugare a unei carti in lista
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    // Metoda de stergere a unei carti din lista
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed from the library: " + book.getTitle());
    }

    // Metoda de afisare a listei de carti din biblioteca
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getISBN() + ")");
        }
    }
}


