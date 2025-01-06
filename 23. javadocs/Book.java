/**
 * @author Ahmad
 * @version 1.0
 * @since 2025-1-5
 */
public class Book {

    /**
     * Default value
     */
    static int val = 10;

    /**
     * Constructor for the Book class
     * @param s Book Name
     */
    public Book(String s) {

    }

    /**
     * Issue a book to a student
     * @param roll roll number of the student
     * @throws Exception if the book is not available
     */
    public void issue(int roll) throws Exception {
    
    }

    /**
     * Checks if a book is available
     * @param str Name of the book
     * @return true if the book is available, otherwise false
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * Gets the name of a book by ID
     * @param id ID of the book
     * @return Name of the book
     */
    public String getName(int id) {
        return "";
    }
}
