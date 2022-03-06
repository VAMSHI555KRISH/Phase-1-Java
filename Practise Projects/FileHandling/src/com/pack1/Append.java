package FileHandling;
import java.io.*;
public class AppendFileHand {
	 public static void main(String[] args){
	 String path = "E:\\File\\NewFile.Txt";
	 String text = " World War 3 IS Near";
	 try
	 {
	 FileWriter f = new FileWriter(path,true);
	 f.write(text);
	 f.close();
	 System.out.println("Append Done Successfully");
	 }
	 catch(IOException e){
	 System.out.println(e);
	 } 
	 }


}
