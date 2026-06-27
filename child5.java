// this program is used to implement constructor in java using super keyword which contains the parent class data also 
// class parent{
//     parent(){
//         System.out.println("parent constructor");
//     }
// }

// class child5 extends parent{
//     child5(){
//         super();
//         System.out.println("child constructor");
//     }

//     public static void main(String[] args){
//         child5 obj = new child5();
//     }
// }

class parent{
    void display(){
        System.out.println("parent class");
    }
}

class child5 extends parent{
    void display(){
        super.display();
        System.out.println("child class");
    }

    public static void main(String[] args){
        child5 obj = new child5();
        obj.display();
    }
}
