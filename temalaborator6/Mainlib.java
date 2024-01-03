package temalaborator6;

import java.util.ArrayList;
import java.util.List;
public class Mainlib {
    {
        public static void main (String[]args){

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");


        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);


        library.displayBooks();


        library.removeBook(book1);


        library.displayBooks();
    }
    }
