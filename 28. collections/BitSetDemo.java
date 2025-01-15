import java.util.*;

public class BitSetDemo 
{
    public static void main(String[] args) 
    {
        // BitSet is a class that provides a way to store bits (0s and 1s) 
        BitSet bs1=new BitSet();
        
        bs1.set(0); // it will set the bit at 0th index to 1
        bs1.set(2); // it will set the bit at 2nd index to 1
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);
           
        System.out.println("bs1: "+bs1);

        BitSet bs2=new BitSet();
       // bs2.set(0);
        bs2.set(1);
       // bs2.set(2);
        bs2.set(3);
       // bs2.set(4);
        bs2.set(5);
       // bs2.set(6);
        bs2.set(7);
       // bs2.set(8);

       System.out.println("bs2: "+bs2);
        
        bs1.and(bs2);
        System.out.println("bs1 AND bs2: "+bs1);

        bs1.or(bs2);
        System.out.println("bs1 OR bs2: "+bs1);
        
        bs1.flip(0,bs1.length());
        System.out.println("Flip: "+bs1);
        
    }  
}