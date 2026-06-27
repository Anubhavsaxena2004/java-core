// this program is used to implement interface in java
interface person{
    void display();   
    
}

interface department extends person{
    void input();
}
class student implements department{
    public void display(){
        System.out.println("Basic interface implementation");
    }

    public void input(){
        System.out.println("Input method implemented");
    }

    public static void main(String[] args){
        student bbd = new student();
        bbd.display();
        bbd.input();
    }
}