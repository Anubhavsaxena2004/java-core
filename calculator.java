// class calculator {

//     int a;
//     int b;

//     // Constructor with arguments
//     calculator(int x, int y) {
//         a = x;
//         b = y;
//     }

//     void add() {
//         System.out.println(a + b);
//     }

//     void subtract() {
//         System.out.println(a - b);
//     }

//     void multiply() {
//         System.out.println(a * b);
//     }

//     void div() {
//         System.out.println(a / b);
//     }

//     public static void main(String[] args) {
        
//         calculator john = new calculator(10, 2);

//         john.add();
//         john.subtract();
//         john.multiply();
//         john.div();
//     }
// }

class calculator{
    static int c = 0 ;
    static int a = 10, b = 2;
    static void addition(){
        c = a + b;
        System.out.println("Addition of a and b is : " + c);
    }

    public static void main(String[] args) {
        addition();
    }
}