import java.io.*;
class userinput{
public static void main(String[] arg){

String name;
int age;
try{
// these are two other ways to take inputs in java 
//BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
DataInputStream p = new DataInputStream(System.in);
System.out.println("Enter name : ");
name = p.readLine();
System.out.println("Enter age : ");
age = Integer.parseInt(p.readLine());
System.out.println("MY name is " + name);
System.out.println("MY age is " + age);
}
catch(Exception k){
System.out.println(k);
}
}
}