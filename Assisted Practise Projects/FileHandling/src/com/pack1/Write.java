package FileHandling;
import java.io.*;
public class WriteFileHand {
	 public static void main(String[] args){
	 try
	 {
	FileWriter f = new FileWriter("E:\\File\\NewFile.Txt");
	 try
	 {
	 f.write("Welcome TO The Future");
	 }
	 finally
	 {
	 f.close();
	 }
	 System.out.println("Task Completed");
	 }
	 catch(IOException i)
	 {
	 System.out.println(i);
	 } 
	 
	 }
	}



