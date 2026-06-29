// this program is used for implementing iterator in java
import java.util.*;
public class person12 {
    public static void main(String[] args){
    ArrayList obj = new ArrayList();
    obj.add(1);
    obj.add(2);
    obj.add(3);
    obj.add(4);
    obj.add(5);
    Iterator itr = obj.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}
