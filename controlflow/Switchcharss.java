package controlflow;

import java.util.Scanner;

public class Switchcharss {
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter char:");
		char ch=S.next().charAt(0);
		switch (ch)
		{
		case 'a':
		System.out.println("ch is a");
		break;
		
		case 'r':
		System.out.println("ch is r");
		break;
		
		case 's':
		System.out.println("ch is s");
		break;
		case 'u':
		System.out.println("ch is u");
		break;
		default:
		System.out.println("invalid");
		break;	
		}
	}
}

