// Java program to demonstrate the use of HashSet in java
import java.util.*;
class person7
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        HashSet obj = new HashSet();
        obj.add("anubhav");
        obj.add("lucknow");
        obj.add(1234);
        obj.add(12.34);
        obj.add("lucknow");
        System.out.println(obj);
        System.out.println(obj.size());
        obj.remove(4);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
        // you ccan do obj. and then can see whatever functions does the hashset
        // contians
        obj.clear();
        System.out.println(obj);
    

    }
}