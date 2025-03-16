import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    
    private String name;
    private LocalDate dob;
    public ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob);
    }

    public String getName() {
        return this.name;
    }

    public String getDob() {
        return this.dob.toString();
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    public int age(){
        int age=Period.between(this.dob, LocalDate.now()).getYears();
        return age;
    }
    
}
