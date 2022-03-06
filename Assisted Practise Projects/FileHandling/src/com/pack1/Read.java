package FileHandling;
import java.io.*;
public class ReadFileHand {
	 public static void main(String[] args){
	 try
	 {
	 FileReader r = new FileReader("E:\\File\\NewFile.Txt");
	 try
	 {
	 int i;
	while((i=r.read())!=-1)
	 {
	 System.out.print((char)i);
	 }
	 }
	 finally
	 {
	 r.close();
	 System.out.print("\n");
	 System.out.print("File Closed");
	 }
	 }
	 catch(IOException e)
	 {
	 System.out.println("Exception Handled");
	 }
	 }
	}


