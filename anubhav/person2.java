import java.io.*;
class person2{
public static void main(String args[])throws IOException{
FileReader obj = new FileReader("aa.txt");
BufferedReader br = new BufferedReader(obj);
System.out.println(br.readLine());

}
}