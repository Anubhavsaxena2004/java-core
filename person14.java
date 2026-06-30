// this program is used for implementing hashset in java
import java.util.*;
public class person14 {
    public static void main(String[] args){
        HashMap h = new HashMap();
        h.put(1, "anubhav");
        h.put(2, "lucknow");
        h.put(3, "lucknow");
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.get(2));
        System.out.println(h.containsKey(2));
        System.out.println(h.containsValue("lucknow"));
        h.remove(2);
        System.out.println(h);
        h.clear();
        System.out.println(h);
        System.out.println(h.isEmpty());
        System.out.println(h.size());
        // you ccan do obj. and then can see whatever functions does the hashset contians
    }
}
