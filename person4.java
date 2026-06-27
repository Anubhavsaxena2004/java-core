// this program is to implement string functions n java
class person4{
    public static void main(String[] args){
        String obj1 = "lucknow";
        String obj2 = "LUCKNOW";
        System.out.println(obj1.length());
        System.out.println(obj1.concat(" BBD"));
        System.out.println(obj1.toLowerCase());
        System.out.println(obj1.toUpperCase());
        System.out.println(obj1.indexOf("k"));
        System.out.println(obj1.charAt(3));
        System.out.println(obj1.endsWith("W"));
        System.out.println(obj1.equals(obj2));
        
        if(obj1.equals(obj2))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}