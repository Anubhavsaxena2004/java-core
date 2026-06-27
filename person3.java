class person3{
    int a ; // instance variable
    int b ;    // instance variable
    void display(int aa , int bb){
        this.a = aa; // this keyword defining instance variable
        this.b = bb; // this keyword defining instance variable
        System.out.println(a+b);
    
    }

    public static void main(String[] args){
        person3 obj = new person3();
        obj.display(10,20);
    }
}