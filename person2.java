// this program is to implement polymorphism overloading and overriding in java
public class person2 {

    void display() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        person2 obj1 = new person2();
        obj1.display();

        A obj2 = new A();
        obj2.display();

        B obj3 = new B();
        obj3.display();

        person2 z;

        z = obj2;
        z.display();

        z = obj3;
        z.display();
    }
}
class A extends person2 {
    void display() {
        System.out.println("hello from class A");
    }
}
class B extends person2 {
    void display() {
        System.out.println("hello from class B");
    }
}