//this code is for inheritance concept in java



class parent{
    int a = 10;
    int b= 20;
}

class child extends parent{
    int c = 0;
    void display(){
        c = a + b;
        System.out.println(c);
    }

    public static void main(String arg[]){
        child obj = new child();
        obj.display();
    }
}