// this program is used ot imlement heirarchy of classes
class parent{
    int a = 10;
    int b = 20;
}
class child1 extends parent{
    int c = 0;
    void display(){
        c = a + b;
        System.out.println(c);
    }
    
}

class child2 extends child1{
    void display1(){
        c = a + b;
        System.out.println(c);
    }

    public static void main(String arg[]){
        child2 obj = new child2();
        obj.display1();
        child1 obj1 = new child1();
        obj1.display();
    }
}