import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {
        
        LinkedList<Integer> al1=new LinkedList<>();
        
        LinkedList<Integer> al2=new LinkedList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);
        //al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
        
        //al1.forEach(n->System.out.println(n));
        //al1.forEach(System.out::println);
        al1.forEach(n->show(n));
        
        //System.out.println(al1.contains(25));
        //System.out.println(al1.get(5));
        //System.out.println(al1.indexOf(70));
        //System.out.println(al1.lastIndexOf(70));
        
        //System.out.println(al1);
        
        /*for(int i=0;i<al1.size();i++)
            System.out.println(al1.get(i));*/
        
        /*for(Integer x:al1)
            System.out.println(x);*/
        
        /*for(Iterator<Integer> it= al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }*/
        
        /*al1.forEach((x)->{
            System.out.println(x);
        });*/
        
        /*for(Iterator<Integer> it=al1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
        
        al1.addFirst(20);
        al1.addLast(30);

        System.out.println(al1);

        al1.removeFirst();
        al1.removeLast();

        System.out.println(al1);

        
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
    
}