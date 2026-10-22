package com.tka;

public class Library {

	    // 10 Variables
	    String libraryName;
	    String location;
	    int libraryId;
	    int totalBooks;
	    int availableBooks;
	    int issuedBooks;
	    String librarianName;
	    String bookName;
	    String authorName;
	    boolean open;

	    // 5 Methods
	    void displayLibraryDetails() {
	        System.out.println("Library Name: " + libraryName);
	        System.out.println("Location: " + location);
	        System.out.println("Library ID: " + libraryId);
	    }

	    void displayBookDetails() {
	        System.out.println("Book Name: " + bookName);
	        System.out.println("Author Name: " + authorName);
	    }

	    void displayBookCount() {
	        System.out.println("Total Books: " + totalBooks);
	        System.out.println("Available Books: " + availableBooks);
	        System.out.println("Issued Books: " + issuedBooks);
	    }

	    void displayLibrarian() {
	        System.out.println("Librarian Name: " + librarianName);
	    }

	    void displayLibraryStatus() {
	        System.out.println("Library Open: " + open);
	    }

	    
	    public static void main(String[] args) {

	        // Object Creation
	        Library l = new Library();

	       
	        l.libraryName = "Central Library";
	        l.location = "Bhubaneswar";
	        l.libraryId = 101;
	        l.totalBooks = 5000;
	        l.availableBooks = 3500;
	        l.issuedBooks = 1500;
	        l.librarianName = "Mr. Sharma";
	        l.bookName = "Rich Dad Poor Dad";
	        l.authorName = "Robert Kiyosaki";
	        l.open = true;

	      
	        l.displayLibraryDetails();
	        l.displayBookDetails();
	        l.displayBookCount();
	        l.displayLibrarian();
	        l.displayLibraryStatus();
	    }
	}

