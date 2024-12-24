import java.time.LocalDate;

public class msg {
    public static void main(String[] args) {
        // User young=new User();
        // young.name="Farhan";
        // young.dob=LocalDate.parse("2002-10-01");

        User young=new User("Farhan","2002-10-01");

        System.out.printf("%s was born on %s and he is now %d years old\n",young.getName(), young.getDob(), young.age());

        // User old=new User();
        // old.name="Raju";
        // old.dob=LocalDate.parse("1990-01-01");

        // System.out.printf("%s was born on %s and he is now %d years old\n",old.name,old.dob.toString(), old.age());


        Book book = new Book();
        
        book.title="Java Fundamentals";
        book.author="Farhan";
        
        young.borrow(book);

        System.out.printf("%s has borrowed these books: %s\n", young.getName(), young.books.toString());
    }
}
