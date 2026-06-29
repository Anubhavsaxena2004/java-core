// this program is used for implementing arraydeque in java
import java.util.*;
public class person10{
    public static void main(String[] args){
        ArrayDeque obj = new ArrayDeque();
        obj.add("anubhav");
        obj.add("lucknow");
        obj.add("lucknow");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj);
        obj.addFirst("bbd");
        System.out.println(obj);
        obj.addLast("bbd");
        System.out.println(obj);
        obj.addAll(Arrays.asList("anubhav","lucknow","lucknow"));
        System.out.println(obj);
        // you ccan do obj. and then can see whatever functions does the arraydeque contians
    }
}