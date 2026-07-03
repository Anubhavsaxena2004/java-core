import java.io.*;
class person{
	public static void main(String args[])throws IOException{
		FileWriter obj = new FileWriter("aa.txt");
		obj.write("Hello This is a basic program, ");
		obj.append("this is being added in the end ");
		obj.close();

}}