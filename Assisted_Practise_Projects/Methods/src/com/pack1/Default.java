package com.pack1;
// Default access modifier 
	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("Defalut access specifier"); 
	     } 
	} 

	public class Default {

		public static void main(String[] args) {
			//default
			System.out.println("Default Access Specifier");
			defAccessSpecifier obj = new defAccessSpecifier(); 		  
	        obj.display(); 

		}
	}

