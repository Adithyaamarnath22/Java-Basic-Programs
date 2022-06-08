package Basics;

import java.io.InputStream;
import java.util.Scanner;

public class scanner {
	public scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("enter number1:");
		int number1=S.nextInt();
		System.out.println("enter number2:");
		int number2=S.nextInt();
		int result=number1+number2;
		System.out.println("the result is:"+result);
		// TODO Auto-generated method stub

	}
}
