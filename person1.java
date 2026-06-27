// this program will tell us about polymorphism overloading 3 types of overloading in java
class person1{
    // void display(int x,int y){
    //     System.out.println(x+y);
    // }
    // void display(float x,float y, float z){
    //     System.out.println(x+y+z);
    // }

    // public static void main(String[] args){
    //     person obj = new person();
    //     obj.display(10,20);
    //     obj.display(10.5f,20.5f,30.5f);
    // }

    void display(int x, char y){
        System.out.println(x + " " + y);
    }
    void display(char y, int x){
        System.out.println(y + " " + x);
    }

    public static void main(String[] args){
        person1 obj = new person1();
        obj.display(10, 'A');
        obj.display('B', 20);
    }
}
