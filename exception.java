import java.io.*;
class exception
{
public static void main(String args[]){
int sum = 0;
try{
for(int i = 0; i < args.length ; i++){
sum += Integer.parseInt(args[i]);
}}
catch(NumberFormatException k){
System.out.println("Pass the valid integer in the gui \n" + k);
}
System.out.println(sum);
}
}