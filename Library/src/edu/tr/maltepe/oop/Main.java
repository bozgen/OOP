package edu.tr.maltepe.oop;

public class Main {
    public static void main(String[] args){
        /*  PREVIOUS LAB
        Student student1 = new Student("bilal", "ozgen", 22, 6548);
        Student student2 = new Student("baran", "yeni", 20, 6549);

        Professor professor1 = new Professor("ensar", "gul", 50,"oop");
        Professor professor2 = new Professor("kayhan", "erciyes", 50, "digital system design");

        System.out.println("Student " + student1.getName()+ " with id "+ student1.getId() + " is " + student1.getAge() + " years old.");
        System.out.println("Student " + student2.getName()+ " with id "+ student2.getId() + " is " + student2.getAge() + " years old.");

        System.out.println("Professor " + professor1.getName()+ " who teaches "+ professor1.getLecture()+ " is "+ professor1.getAge() + " years old.");
        System.out.println("Professor " + professor2.getName()+ " who teaches "+ professor2.getLecture()+ " is "+ professor2.getAge() + " years old.");

        System.out.println("\n");

        professor1.setLecture("Object Oriented Programming");
        System.out.println("Professor " + professor1.getName()+ " who teaches "+ professor1.getLecture()+ " is "+ professor1.getAge() + " years old.");


        professor2.tellLecture();

        student2.greet();
        */

        /* Assignment  */
        Student s1 = new Student("Bilal","Ozgen",22,6548);
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

        /* By Title
        lib.printAvailableBooks();
        Book selectedBook = lib.getBookByTitle("The Hobbit");
        if( null != selectedBook){
            s1.borrowBook(selectedBook,lib);
        }
        System.out.println("\n The borrowed books of "+ s1.getName()+" are:\n");
        System.out.println(s1.getBorrowedBooks().get(0).getTitle());
        */

        lib.printAvailableBooks();
        p1.borrowBook(lib.books.get(2),lib);

        p1.printBorrowedBooks();
        lib.printAvailableBooks();
    }
}
