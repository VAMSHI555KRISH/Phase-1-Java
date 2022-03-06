package com.pack1;
//default constructor
class StdInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class Default {

public static void main(String[] args) {

	StdInfo Std1=new StdInfo();
	StdInfo Std2=new StdInfo();

	Std1.display();
	Std2.display();
	}
}
