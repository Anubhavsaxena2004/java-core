// this program is used for taking input from user
import java.util.*;
public class person15 {
    public static void main(String[] args){
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Your name is "+name+" and your age is "+age);
        sc.close();
    }
}
