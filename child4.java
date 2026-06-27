// this program is usd to implement poymosphism overriding in java
class parent{
    void display(int a , int b){
        System.out.println(a+b);
    }

}
class child4 extends parent{
    void display(int a , int b){
        System.out.println(a*b);
    }

    public static void main(String[] args){
        child4 obj = new child4();
        obj.display(10,20);
    }
}

