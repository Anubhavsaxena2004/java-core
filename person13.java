// this program is used for implementing vector in java
import java.util.*;

public class person13 {
    public static void main(String[] args){
        Vector bbd = new Vector();
        bbd.insertElementAt("lucknow", 0);
        bbd.insertElementAt("anubhav", 1);
        bbd.insertElementAt("anubhuti", 2);
        bbd.insertElementAt("mihir", 3);
        System.out.println(bbd.get(0));
        System.out.println(bbd.size());
        bbd.remove(2);
        System.out.println(bbd);
        bbd.clear();
        System.out.println(bbd);
        // you ccan do obj. and then can see whatever functions does the vector contians
    }
}
