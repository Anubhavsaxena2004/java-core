class person5{
    public static void main(String[] args){
        StringBuffer obj = new StringBuffer("lucknow"); // StringBuffer is mutable ans used for modifying the string
        System.out.println(obj.reverse());
        System.out.println(obj.insert(2,"anubhav"));
        System.out.println(obj.append("wow"));
        System.out.println(obj.delete(2,6));
    }
}