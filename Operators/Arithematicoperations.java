package Operators;

import java.util.Scanner;

public class Arithematicoperations 
{
	public static void main(String args[])
	{	
		System.out.println("\tARITHEMATIC OPERATIONS");
		System.out.println("\t-----------------------");
		System.out.println();

		System.out.println("1.Addition");
		System.out.println("  --------");
		System.out.println("enter 2 numbers:");
		Scanner S= new Scanner(System.in);
		System.out.println("number1:");
		int number1= S.nextInt();
		System.out.println("number2:");
		int number2= S.nextInt();
		int result= number1 + number2;
		System.out.println("result:"+result);
		System.out.println();
		
		System.out.println("2.Substraction");
		System.out.println("  -----------");
		System.out.println("enter 2 numbers:");
		Scanner S1=new Scanner(System.in);
		System.out.println("num1");
		int num1=S1.nextInt();
		System.out.println("num2");
		int num2=S1.nextInt();
		int result1=num1-num2;
		System.out.println("result:"+result1);
		System.out.println();
		
		System.out.println("3.Multiplication");
		System.out.println("  --------------");
		System.out.println("enter 2 numbers");
		Scanner S2=new Scanner(System.in);
		System.out.println("no1:");
		int no1= S2.nextInt();
		System.out.println("no2:");
		int no2=S2.nextInt();
		int result2=no1*no2;
		System.out.println("result:"+result2);
		System.out.println();
		
		System.out.println("4.Division");
		System.out.println("  -------");
		System.out.println("enter 2 numbers");
		Scanner S3=new Scanner(System.in);
		System.out.println("No1:");
		int No1= S3.nextInt();
		System.out.println("No2:");
		int No2=S3.nextInt();
		int result3=No1/No2;
		System.out.println("result:"+result3);
		System.out.println();
		
		System.out.println("5.Modeless");
		System.out.println("  -------");
		System.out.println("enter 2 numbers");
		Scanner S4=new Scanner(System.in);
		System.out.println("Num1:");
		int Num1= S4.nextInt();
		System.out.println("Num2:");
		int Num2=S4.nextInt();
	    int result4=Num1%Num2;
		System.out.println("result:"+result4);
		System.out.println();	
	}
}
