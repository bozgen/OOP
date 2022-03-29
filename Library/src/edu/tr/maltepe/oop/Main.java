package edu.tr.maltepe.oop;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Bilal","Ozgen",22,6548);
        Student s2 = new Student("Arda","Hacifevzioglu",22,6549);
        Professor p1 = new Professor("Ensar", "Gul", 60, "oop");
        Library lib = new Library("Maltepe University Library");

        lib.books.add(new Book("The Hobbit", "J.R.R. Tolkien", "fantasy",310));
        lib.books.add(new Book("The Fellowship of The Ring", "J.R.R. Tolkien", "fantasy",423));
        lib.books.add(new Book("The Two Towers", "J.R.R. Tolkien", "fantasy",352));
        lib.books.add(new Book("The Return of The King", "J.R.R. Tolkien", "fantasy",416));
        lib.books.add(new Book("The Silmarillion", "J.R.R. Tolkien", "fantasy",365));


        lib.printAvailableBooks();
        s1.borrowBook(lib.books.get(3),lib);
        s1.printBorrowedBooks();

        lib.printAvailableBooks();
        s1.borrowBook(lib.books.get(3),lib);
        s1.printBorrowedBooks();

        lib.printAvailableBooks();

        s1.returnBook(s1.borrowedBooks.get(0),lib);
        s1.printBorrowedBooks();
        lib.printAvailableBooks();

        s2.borrowBook(lib.books.get(0),lib);
        s2.printBorrowedBooks();
        lib.printAvailableBooks();
        /* By Title
        lib.printAvailableBooks();
        Book selectedBook = lib.getBookByTitle("The Hobbit");
        if( null != selectedBook){
            s1.borrowBook(selectedBook,lib);
        }
        System.out.println("\n The borrowed books of "+ s1.getName()+" are:\n");
        System.out.println(s1.getBorrowedBooks().get(0).getTitle());
        */

        p1.borrowBook(lib.books.get(2),lib);

        p1.printBorrowedBooks();
        lib.printAvailableBooks();
    }
}
