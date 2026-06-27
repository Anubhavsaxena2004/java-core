// this code is to implement multiple inheritance in java using interface
interface father{
    void input1();
}

interface mother{
    void input2();
}

class child3 implements father, mother{
    public void input1(){
        System.out.println("Father interface implemented");
    }

    public void input2(){
        System.out.println("Mother interface implemented");
    }

    public static void main(String[] args){
        child3 obj = new child3();
        obj.input1();
        obj.input2();
    }
}