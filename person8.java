// this program is sued for implementing treeset 
import java.util.*;
class person8 {
    public static void  main(String[] args){
        TreeSet obj = new TreeSet();
        obj.add(3);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        System.out.println(obj);
        System.out.println(obj.first());
        System.out.println(obj.last());
        System.out.println(obj.pollFirst());
        System.out.println(obj);
        System.out.println(obj.pollLast());
        System.out.println(obj);
        obj.remove(3);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
    }
}
