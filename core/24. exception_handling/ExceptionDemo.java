import java.util.Scanner;

public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
        
        try
        {
            c=a/b;
            System.out.println("Division is" +c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again");
        }
        finally 
        {
            System.out.println("Finally block is always executed");
        }
        
    } 
}