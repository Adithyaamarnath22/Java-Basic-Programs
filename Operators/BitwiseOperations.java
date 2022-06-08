package Operators;

import java.util.Scanner;

public class BitwiseOperations {
	public static void main(String args[])
	{
		System.out.println("\tBitwiseOperaions");
		System.out.println("\t----------------");
		System.out.println("&");
		Scanner S=new Scanner(System.in);
		System.out.println("num1");
		int num1=S.nextInt();
		System.out.println("num2");
		int num2=S.nextInt();
		System.out.println(num1&num2);
		System.out.println("|");
		Scanner S1=new Scanner(System.in);
		System.out.println("no1");
		int no1=S.nextInt();
		System.out.println("no2");
		int no2=S.nextInt();
		System.out.println(no1|no2);
		System.out.println("~");
		Scanner S2=new Scanner(System.in);
		System.out.println("No1");
		int No1=S.nextInt();
		System.out.println(~No1);
		System.out.println("^");
		Scanner S3=new Scanner(System.in);
		System.out.println("Num1");
		int Num1=S.nextInt();
		System.out.println("Num2");
		int Num2=S.nextInt();
		System.out.println(Num1^Num2);
		System.out.println("<<");
		Scanner S4=new Scanner(System.in);
		System.out.println("Num");
		int Num=S.nextInt();
		System.out.println(Num<<1);
		
		

		
	
		
		
		
	}

}
