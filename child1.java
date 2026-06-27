// this rpogram is to demonstrate the concept of inheritance in java at multi levels

class grandparent {
    int a = 10;
    int b = 20;
}
class parent extends grandparent {
    int c = 0;
}

class child1 extends parent {
    void display(){
        c = a + b;
        System.out.println(c);
    }

    public static void main(String arg[]){
        child1 obj = new child1();
        obj.display();
    }
}
