// this program is used for implementing stack in java
import java.util.*;
public class person11 {
    public static void main(String[] args){
        Stack obj = new Stack();
        obj.push("anubhav");
        obj.push("lucknow");
        obj.push("lucknow");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
        // you ccan do obj. and then can see whatever functions does the stack contians
    }

}
