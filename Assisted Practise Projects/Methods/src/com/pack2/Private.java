package com.pack2;
//Private access specifiers
class priaccessspecifier 
{ 
 private void display() 
  { 
      System.out.println("Private access specifier"); 
  } 
} 

public class Private {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
     

	}
}

