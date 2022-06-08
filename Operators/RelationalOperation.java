package Operators;

import java.util.Scanner;

public class RelationalOperation 
{
	public static void main(String args[])
	{
		System.out.println("\t Relational Operations");
		System.out.println("\t-----------------------");
		System.out.println();
		System.out.println("<");
		Scanner S=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1= S.nextInt();
		System.out.println("enter num2:");
		int num2=S.nextInt();
		System.out.println(num1<num2);
		System.out.println();
		System.out.println(">");
		Scanner S1=new Scanner(System.in);
		System.out.println("enter num1:");
		int no1= S.nextInt();
		System.out.println("enter num2:");
		int no2=S.nextInt();
		System.out.println(no1>no2);
		System.out.println();
		System.out.println("<=");
		Scanner S2=new Scanner(System.in);
		System.out.println("enter num1:");
		int nu1= S.nextInt();
		System.out.println("enter num2:");
		int nu2=S.nextInt();
		System.out.println(nu1<=nu2);
		System.out.println();
		System.out.println(">=");
		Scanner S3=new Scanner(System.in);
		System.out.println("enter num1:");
		int No1= S.nextInt();
		System.out.println("enter num2:");
		int No2=S.nextInt();
		System.out.println(No1>=No2);
		System.out.println();
		System.out.println("==");
		Scanner S4=new Scanner(System.in);
		System.out.println("enter num1:");
		int Num1= S.nextInt();
		System.out.println("enter num2:");
		int Num2=S.nextInt();
		System.out.println(Num1==Num2);
		System.out.println();
		System.out.println("!=");
		Scanner S5=new Scanner(System.in);
		System.out.println("enter num1:");
		int number1= S.nextInt();
		System.out.println("enter num2:");
		int number2=S.nextInt();
		System.out.println(number1!=number2);
		System.out.println();
	}

}
