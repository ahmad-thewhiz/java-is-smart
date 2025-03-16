import java.lang.*;

public class commadLine {
    public static void main(String[] args) {
        for(String s:args) {
            System.out.println(s);
        }

        // add numbers
        double sum=0.0;

        for(String s:args) {
            if(s.matches("[0-9\\.]+"))
                sum+=Double.parseDouble(s);
        }

        System.out.println("Sum: "+sum);
    }
}
