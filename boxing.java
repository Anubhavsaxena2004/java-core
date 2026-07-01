public class boxing {
    
    public static void main(String[] arg){
    int i = 10;
    Integer i1 = new Integer(i); // Autoboxing
    // the explanation of autoboxing is that the primitive data type is converted into the object of the wrapper class.
    // the explanation in hinglish is ki primitive data type ko wrapper class ke object me convert kar diya jata hai.
    System.out.println(i1);
    Integer m = new Integer(21); // Unboxing
    // the explanation of unboxing is that the object of the wrapper class is converted into the primitive data type.
    // the explanation in hinglish is ki wrapper class ke object ko primitive data type me convert kar diya jata hai.
    // the explanation of boxing is that the primitive data type is converted into the object of the wrapper class.
    int y = m;
    System.out.println(y);
    }
}