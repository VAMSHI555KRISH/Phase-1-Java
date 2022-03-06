package com.pack1;

import java.util.*;
public class ArthimeticCalcutor 
{

	public static void main(String[] args) 
	{
		char operator;
		double A, B, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an Operator: +, - , * , / ");
		operator = input.next().charAt(0);
		System.out.println("Enter First Number ");
		A = input.nextDouble();
		System.out.println("Enter Second Number ");
		B = input.nextDouble();
		switch(operator)
		{
		// Addition
		case '+':
			result = A + B;
			System.out.println(A + " + " + B + " = "+ result);
			break;
			//Subtraction 
		case '-':
			result = A - B;
			System.out.println(A + " - " + B + " = "+ result);
			break;
			//Multiplication
		case '*':
			result = A * B;
			System.out.println(A + " * " + B + " = "+ result);
			break;
			// Division
		case '/':
			result = A / B;
			System.out.println(A + " / " + B + " = "+ result);
			break;
			
			default:
				System.out.println("....Operator not Valid......");
				break;
		}
		
		input.close();
	}

}
