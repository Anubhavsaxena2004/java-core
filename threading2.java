class threading2 implements Runnable{
public void run(){
    for(int i = 0; i <= 50; i++){
        try {
            System.out.println(i);
            Thread.sleep(2000);
        }
        catch(Exception e) {
            System.out.println("entered correct: " + e);
        }
    }
}  

public static void main(String args[]){
    threading2 p = new threading2();
    Thread m = new Thread(p);
    m.start();

}
}