// this program is used for implementing priorityqueue in java
import java.util.*;
public class person9 {
    public static void main(String[] args){
        PriorityQueue obj = new PriorityQueue();
        obj.add("anubhav");
        obj.add("lucknow");
        obj.add("lucknow");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj);
        obj.remove(4);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
        // you ccan do obj. and then can see whatever functions does the priorityqueue contians
    }
}
