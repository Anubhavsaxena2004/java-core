class exception3{
public static void main(String[] arg){
try{
int m[] = new int[3];
m[0] = 10;
m[1] = 20;
m[2] = 30;
System.out.println(m[3]);
}
catch(Exception k){
System.out.println("index is out of range kindly put valid index");
}
}}