class exception2{
public static void main(String[] arg){
try{
int a = 1;
int b = 0;
int c = a / b;
System.out.println(c);
}
catch(Exception e){
System.out.println("please take a valid no. in b not zero");
}

}}