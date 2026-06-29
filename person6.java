// this program is to implement arraylist in java
import java.util.*;

class person6{
    public static void main (String[] args){
        ArrayList obj = new ArrayList();
        obj.add("anubhav");
        obj.add("lucknow");
        obj.add(1234);
        obj.add(12.34);
        obj.add("lucknow");
        System.out.println(obj);
        System.out.println(obj.size());
        obj.add(2, "bbd");
        System.out.println(obj);
        System.out.println(obj.get(2));
        System.out.println(obj.indexOf("lucknow"));
        System.out.println(obj.lastIndexOf("lucknow"));
        obj.remove(4);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
        // you ccan do obj. and then can see whatever functions does the arraylist contians
    }
}